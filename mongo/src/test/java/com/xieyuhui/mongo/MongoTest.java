package com.xieyuhui.mongo;

import com.alibaba.fastjson.JSONObject;
import com.xieyuhui.mongo.dao.DemoDao;
import com.xieyuhui.mongo.domin.DemoEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-18 14:08
 * @Description:
 */
public class MongoTest extends MongoApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void saveDemo() {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);
    }

    @Test
    public void removeDemoTest() {
        demoDao.removeDemo(2L);
    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB 更新数据");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {
        DemoEntity demoEntity = demoDao.findDemoById(2L);
        System.out.println(JSONObject.toJSONString(demoEntity));
    }

    @Test
    public void query() {
        Query query = new Query(Criteria.where("by").is("souyunku"));
        List<DemoEntity> list = mongoTemplate.find(query,DemoEntity.class);
        System.out.println(JSONObject.toJSONString(list));
    }

}
