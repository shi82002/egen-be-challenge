package com.egen.dao;

import com.egen.MorphiaConfig;
import com.egen.model.Alert;
import com.egen.model.Metric;
import com.egen.rules.MetricsRule;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlertDAO {


    Datastore datastore;

    public AlertDAO() {
        datastore = MorphiaConfig.getInstance().getDatastore();
    }

    public ObjectId create(Alert alert) {
        Datastore datastore = MorphiaConfig.getInstance().getDatastore();

        datastore.save(alert);

        return alert.getId();
    }

    public List<Alert> read () {
        Query<Alert> query = datastore.createQuery(Alert.class);

        return query.asList();
    }

    public List<Alert> readByRange(long startTime, long endTime) {
        Query<Alert> query = datastore.createQuery(Alert.class)
                .filter("timeStamp >=", startTime).filter("timeStamp <=", endTime);

        return query.asList();
    }

}
