package com.itechart.mongoparser.service.mongoAdapted;

import com.mongodb.DBObject;

import java.util.List;

/**
 * Execute sql query with mongoDB syntax.
 */
public interface MongoAdaptedService {

    /**
     * Convert passed SQL query and execute it in mongoDB.
     *
     * @param query sql query
     * @return result of executing in mongodb
     */
    List<DBObject> convertSqlAndExecute(String query);
}
