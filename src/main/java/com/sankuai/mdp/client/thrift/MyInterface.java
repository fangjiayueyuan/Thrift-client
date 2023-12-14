package com.sankuai.mdp.client.thrift;

import com.facebook.swift.service.ThriftMethod;
import com.facebook.swift.service.ThriftService;
import org.apache.thrift.TException;

/**
 * @projectName: sample
 * @package: com.meituan.mdp.sample.thrift
 * @className: MyInterface
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2023/12/14 22:02
 * @version: 1.0
 */
public class MyInterface {
    @ThriftService
    public interface Iface{
        @ThriftMethod
        public String sayHello(String username) throws TException;

        @ThriftMethod
        public String sayGoodBye(String username) throws TException;

    }
}
