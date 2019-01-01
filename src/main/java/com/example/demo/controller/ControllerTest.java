package com.example.demo.controller;

import com.example.demo.pojo.Cat;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lusaijie on 2019/1/1.
 *
 * @Author lusaijie
 */
@Component
@Path("/test")
public class ControllerTest {
    @GET()
    @Path("jsonTest")
    @Produces(MediaType.APPLICATION_JSON)
    public Object jsonMessage() {
        Map<String, String> tmp = new HashMap<>();
        tmp.put("info", "hi");
        return tmp;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Object testMessage(@PathParam("id") Integer id, @QueryParam("name") String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("this is id:").append(id).append("this is name:").append(name);
        return sb.toString();
    }

    @POST
    @Path("/cat")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Object catMessage(Cat cat) {
        return cat;
    }
}
