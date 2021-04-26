package com.lagou.demo;

import com.lagou.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务对象接口必须集成Remote接口
 * 同时方法必须抛出RemoteException
 */
public interface IHelloService extends Remote {
    String sayHello(User user) throws RemoteException;
}
