package com.example.demo.pojo;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by lusaijie on 2019/1/1.
 */
@Data
public class Cat  {
    @NotNull(message = "猫名不能为空")
    private String name;
    @NotNull(message = "猫重不能为空")
    private Integer weight;
}
