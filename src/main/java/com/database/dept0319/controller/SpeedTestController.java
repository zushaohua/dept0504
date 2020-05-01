package com.database.dept0319.controller;

import com.database.dept0319.entity.SpeedTest;
import com.database.dept0319.service.SpeedTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class SpeedTestController {
    @Resource
    public SpeedTestService speedTestService;
    @RequestMapping("/speedtest/{id}")
    @ResponseBody
    public SpeedTest findByID (@PathVariable("id") Integer id){
        return speedTestService.findByID(id);
    }
    @RequestMapping("/speedtest")
    @ResponseBody
//    public List<Speed> findAll(){
//        return deptService.findAll();
//    }
    public List<SpeedTest> findAll(){
        return speedTestService.findAll();
    }
    @RequestMapping("/speedtest/create")
    @ResponseBody
    public  SpeedTest create (){
        SpeedTest speedTest = new SpeedTest();
        speedTest.setProvince("dongbei");
        speedTest.setCity("haerbin");
        speedTest.setName("lss");
        speedTest.setBroadbandid(123456);
        speedTest.setSpeedvalue(20);
        speedTest.setPacketlench(46123);
        speedTest.setDate(new Date());
        speedTestService.create(speedTest);
        return speedTest;
    }
    @RequestMapping("/speedtest/update")
    @ResponseBody
    public  SpeedTest update(){
        SpeedTest speedTest =speedTestService.findByID(1);
        speedTest.setSpeedvalue(56);
        speedTestService.update(speedTest);
        return speedTest;
    }
    @RequestMapping("/speedtest/delete/{speedno}")
    @ResponseBody
    public String delete (@PathVariable("speedno") Integer speedno){
        speedTestService.delete(speedno);
        return "delete success";
    }
}
