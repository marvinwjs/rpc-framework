 package com.marvin.rpc.runner;

import com.marvin.rpc.config.NettyConfig;
import com.marvin.rpc.netty.server.RpcListenerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

 /**
  * IOT 服务启动器
  *
  * @author marvinwjs
  */
 @Component
public class RpcListenerRunner implements CommandLineRunner {
    private final static Logger LOGGER = LoggerFactory.getLogger(RpcListenerRunner.class);
    @Autowired
    private NettyConfig nettyConfig;
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("start netty server");

        RpcListenerServer server = new RpcListenerServer(nettyConfig.getPort());
        server.setBossThreadNum(nettyConfig.getBossThreadNum());
        server.setWorkerThreadNum(nettyConfig.getWorkerThreadNum());
        server.startServer();
    }
}
