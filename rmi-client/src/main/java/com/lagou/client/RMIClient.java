package com.lagou.client;

import com.lagou.demo.IHelloService;
import com.lagou.pojo.User;

import javax.management.remote.rmi.RMIConnection;
import javax.management.remote.rmi.RMIConnectionImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @description: .
 * @date: 2021-04-26
 * @author: YuBo
 */
public class RMIClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        final IHelloService helloService = (IHelloService) Naming.lookup("rmi://127.0.0.1:8888/hello");
        User user = new User();
        user.setName("余波");
        user.setAge(20);
        System.out.println(helloService.sayHello(user));
    }
}
