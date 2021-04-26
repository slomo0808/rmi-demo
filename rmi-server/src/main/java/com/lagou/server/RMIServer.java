package com.lagou.server;

import com.lagou.demo.HelloServiceImpl;
import com.lagou.demo.IHelloService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @description: .
 * @date: 2021-04-26
 * @author: YuBo
 */
public class RMIServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        // 1.创建一个远程对象，同时创建stub对象以及skeleton对象
        final IHelloService helloService = new HelloServiceImpl();

        // 2.启动注册服务: 创建了远程对象注册表Registry的实例，并指定端口为8888
        LocateRegistry.createRegistry(8888);
        /**
         * 3.真正注册服务
         *      绑定的URL的标准格式：rmi://host:port/{name}
         *          其中rmi可以省略
         */
        Naming.bind("rmi://127.0.0.1:8888/hello", helloService);
    }
}
