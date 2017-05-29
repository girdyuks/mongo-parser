package com.itechart.mongoparser.model;

import lombok.Data;

import java.util.List;


@Data
public class ParsedQuery {
    private List<String> fields;
    private String collection;
    private String whereStatement;
    private String orderByStatement;
    private String limit;
}
