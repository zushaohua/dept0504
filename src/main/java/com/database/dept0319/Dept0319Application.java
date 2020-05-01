package com.database.dept0319;

import com.database.dept0319.common.CommonVariable;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.Packet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@MapperScan("com.database.dept0319.mapper")
//@Controller
public class Dept0319Application {
//    @RequestMapping("/startspeedtest")
//   @ResponseBody
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Dept0319Application.class, args);
//        CommonVariable.caplen=0;
//        CommonVariable.downloadtime=0;
//        ExecutorService executorServiceJcap = Executors.newFixedThreadPool(10);
//        ExecutorService executorServiceSpeed = Executors.newFixedThreadPool(10);
//        ExecutorService executorServiceDownload = Executors.newFixedThreadPool(10);
//        Jcap jcap =new Jcap();
//        Speed speed=new Speed();
//        Download download=new Download();
//        CommonVariable.downlable=true;
//        executorServiceJcap.submit(jcap);
//        executorServiceDownload.submit(download);
//        Thread.sleep(10);
//        executorServiceSpeed.submit(speed);
//       // Thread.sleep(30000);
//        //CommonVariable.downlable=false;
//        executorServiceJcap.shutdown();
//        executorServiceSpeed.shutdown();
//        executorServiceDownload.shutdown();
   }
}

////
//class Jcap implements Callable<Integer> {
//    private  String name;
//    Object lock = new Object();
//    public void setName(String name){
//        this.name = name;
//    }
//    @Override
//    public Integer call() throws Exception {
//        JpcapCaptor captor;
//        Packet packet = new Packet();
//        NetworkInterface[] devices = JpcapCaptor.getDeviceList();//获取网卡设备
//        for (NetworkInterface n : devices) {
//            System.out.println(n.name + "     |     " + n.description);
//        }//打印出所有网卡设备
//        captor = JpcapCaptor.openDevice(devices[1], 2000, true, 300000);
//        //设置抓包条件，并返回抓包个数，device为要抓的网卡，2000为单个抓包的最大长度，true代表抓混合模式的包，3000为截止时间
//        while(true) {
//            if(CommonVariable.downlable==true){ //downlable 为下载完成的标志
//                packet = captor.getPacket();    //抓一个包
//                if(packet!=null)
//                    //  CommonVariable.packettime= packet.usec;//获取最后一个抓包的时间戳
//                    CommonVariable.caplen += packet.caplen;//抓包的长度相加之和
//                //System.out.println("downlable in Jcap file:："+CommonVariable.downlable);
//                //  System.out.println("Jcap time now:"+System.currentTimeMillis());
//            }else{
//                // System.out.println("downlable in Jcap file:"+CommonVariable.downlable+"Time now:"+System.currentTimeMillis());
//                break;}
//        }
//        return CommonVariable.caplen;//返回抓包的长度
//    }
//}
//class  Speed implements Callable<Integer>{
//    private  String name;
//    Object lock2 = new Object();
//    public void setName(String name){
//        this.name = name;
//    }
//    private Integer nowcaplen=0;
//    private Integer oldcaplen=0;
//    private long speed=0;
//    private Integer averagespeed=0;
//    private Integer sumcaplen=0;
//    private int maxspeed=0;
//    private int minspeed=0;
//    @Override
//    public Integer call() throws Exception {
//        while (true){
//            if(CommonVariable.downlable==true){
//                oldcaplen=CommonVariable.caplen;
//                Thread.sleep(1000);
//                nowcaplen=CommonVariable.caplen;
//                speed=8*(nowcaplen-oldcaplen)/1024/1024;
//                CommonVariable.downloadtime ++;
//                System.out.println("speed:"+speed+"Mb/s "+"oldcaplen:"+oldcaplen+" nowcaplen"+nowcaplen);
//            }
//            else{
//                sumcaplen=CommonVariable.caplen/1024/1024*8;
//                averagespeed=sumcaplen/CommonVariable.downloadtime;
//                System.out.println("-------------------------------------------");
//                System.out.println("下载完成");
//                System.out.println("下载包大小："+sumcaplen+"Mb"+"  平均速度："+averagespeed+"Mb/s");
//                break;
//            }
//        }
//        return nowcaplen;
//    }
//}
//class  Download implements Callable<String>{
//    @Override
//    public String call() throws Exception {
//        JpcapCaptor captor;
//        String keyword;
//        keyword="https://dl.360safe.com/inst.exe";
//        URL url = new URL(keyword);
//        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//        urlConnection.connect();
//        int code=0;
//        //200表示ok，500表示服务器错误，404表示找不到
//        code =urlConnection.getResponseCode();
//        //如果状态码为200，表示连接ok，可以继续操作
//        if(code==200){
//            InputStream is = urlConnection.getInputStream();
//            BufferedInputStream bis=new BufferedInputStream(is);
//            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("360.exe"));
//            byte[] buffer  = new byte[1024];
//            int len;
//            while ((len=is.read(buffer)) != -1) {
//                bos.write(buffer,0,len);
//                bos.flush();
//            }
//            bis.close();
//            bos.close();
//            is.close();
//            urlConnection.disconnect();
//        }
//        CommonVariable.downlable=false;
//        // Thread.sleep(100);
//        return "download success";
//    }
//}

