package com.xieyuhui.mongo.dao;

import com.xieyuhui.mongo.domin.DemoEntity;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-18 19:02
 * @Description:
 */
public interface DemoDao {
    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
