package com.itechart.mongoparser.controller;

import com.itechart.mongoparser.service.mongoAdapted.MongoAdaptedService;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/execute-sql")
public class MongoAdapterController {
    @Autowired
    private MongoAdaptedService mongoAdaptedService;

    @GetMapping("/")
    public Collection<DBObject> applySqlQuery(@RequestParam("query") String query) {
        return mongoAdaptedService.convertSqlAndExecute(query);
    }
}
