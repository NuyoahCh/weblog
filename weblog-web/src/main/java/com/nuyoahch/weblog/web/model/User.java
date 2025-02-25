package com.nuyoahch.weblog.web.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: weblog
 * @author: NuyoahCh
 * @create: 2025-02-25
 * @description:
 */
@Data
@ApiModel(value = "用户实体类")
public class User {
    // 用户名
    @NotBlank(message = "用户名不能为空") // 注解确保用户名不为空
    @ApiModelProperty(value = "用户名")
    private String username;
    // 性别
    @NotNull(message = "性别不能为空") // 注解确保性别不为空
    @ApiModelProperty(value = "用户性别")
    private Integer sex;

    // 年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄必须大于或等于 18")  // 注解确保年龄大于等于 18
    @Max(value = 100, message = "年龄必须小于或等于 100")  // 注解确保年龄小于等于 100
    @ApiModelProperty(value = "年龄")
    private Integer age;

    // 邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")  // 注解确保邮箱格式正确
    @ApiModelProperty(value = "邮箱")
    private String email;
    // 创建时间
    private LocalDateTime createTime;
    // 更新日期
    private LocalDate updateDate;
    // 时间
    private LocalTime time;
}
