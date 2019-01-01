package com.example.demo.config;

import com.example.demo.controller.ControllerTest;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by lusaijie on 2019/1/1.
 */
@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ControllerTest.class);
    }

}
