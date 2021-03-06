package com.xieyuhui.mongo.dao.impl;

import com.xieyuhui.mongo.dao.DemoDao;
import com.xieyuhui.mongo.domin.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-18 19:02
 * @Description:
 */
@Component
public class DemoDaoImpl implements DemoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveDemo(DemoEntity demoEntity) {
        mongoTemplate.save(demoEntity);
    }

    @Override
    public void removeDemo(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,DemoEntity.class);
    }

    @Override
    public void updateDemo(DemoEntity demoEntity) {
        Query query = new Query(Criteria.where("id").is(demoEntity.getId()));
        Update update = new Update();
        update.set("title", demoEntity.getTitle());
        update.set("description", demoEntity.getDescription());
        update.set("by", demoEntity.getBy());
        update.set("url", demoEntity.getUrl());
        mongoTemplate.updateFirst(query, update, DemoEntity.class);
    }

    @Override
    public DemoEntity findDemoById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query,DemoEntity.class);
    }


}
