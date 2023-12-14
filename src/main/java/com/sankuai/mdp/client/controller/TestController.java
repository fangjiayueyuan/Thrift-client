package com.sankuai.mdp.client.controller;

import com.meituan.mdp.boot.starter.thrift.annotation.MdpThriftClient;
import com.sankuai.mdp.client.thrift.MyInterface;
import org.apache.thrift.TException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: client
 * @package: com.sankuai.mdp.client.controller
 * @className: TestController
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2023/12/14 22:54
 * @version: 1.0
 */
@RestController
public class TestController {
    @MdpThriftClient(remoteAppKey = "com.sankuai.mdp.demo1",remoteServerPort = 7101,timeout = 100)
    private MyInterface.Iface helloService;
    @RequestMapping(path = {"/sayHello"},method = RequestMethod.GET)
    public String sayHello(){
        try{
            return helloService.sayHello("world");
        }catch (TException e){
            e.printStackTrace();
        }
        return "hello";
    }
    @RequestMapping(path = {"/sayBay"},method = RequestMethod.GET)
    public String sayBay(){
        try{
            return helloService.sayGoodBye("world");
        }catch (TException e){
            e.printStackTrace();
        }
        return "Bay";
    }
}
