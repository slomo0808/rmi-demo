package com.lagou.demo;

import com.lagou.pojo.User;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程服务对象实现类，必须要继承UnicastRemoteObject
 */
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {
    private static final long serialVersionUID = 3543444110348201211L;

    public HelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(User user) throws RemoteException {
        System.out.println("this is server, hello " + user.getName());
        return "success";
    }
}
