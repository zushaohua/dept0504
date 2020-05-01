package com.database.dept0319.service;


import com.database.dept0319.entity.SpeedTest;
import com.database.dept0319.mapper.SpeedTestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpeedTestService {
    @Resource
//    查找
    private SpeedTestMapper  speedTestMapper =null;
    public SpeedTest findByID (Integer speedno){
        return  speedTestMapper.findByID(speedno);
    }
//    public List<Dept> findAll(){
//        return deptMapper.findAll();
//   }
    public List<SpeedTest> findAll(){
        return  speedTestMapper.findAll();
    }
    @Transactional(rollbackFor = Exception.class)
    public void  create (SpeedTest speedTest){
          speedTestMapper.create(speedTest);
    }
    @Transactional(rollbackFor = Exception.class)
    public  void update (SpeedTest speedTest){
        speedTestMapper.update(speedTest);
    }
//    public void delete (Integer deptno){
//        deptMapper.delete(deptno);
//    }
    public  void  delete (Integer speedno){
        speedTestMapper.delete(speedno);
    }
}
