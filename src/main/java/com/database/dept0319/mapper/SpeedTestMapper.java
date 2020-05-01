package com.database.dept0319.mapper;


import com.database.dept0319.entity.SpeedTest;

import java.util.List;

public interface SpeedTestMapper {
    //查找数据
    public SpeedTest findByID(Integer speedno);
    public List<SpeedTest> findAll();
    //插入数据
    public void create(SpeedTest speedTest);
    //更新
    public void update(SpeedTest speedTest);
    //删除
    public void delete(Integer  speedno);
}
