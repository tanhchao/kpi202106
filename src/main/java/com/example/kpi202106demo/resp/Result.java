package com.example.kpi202106demo.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 谭红超
 * @Description:
 * @since 2021-06-22 09:33
 */
@ApiModel(value = "返回结果类")
@Getter
@Setter
@AllArgsConstructor
public class Result implements Serializable {

    @ApiModelProperty(value = "状态判断")
    private Boolean success;

    @ApiModelProperty(value = "信息提示")
    private String message;

}
