package com.huang.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;



@Data
@TableName("electric_house")
@ApiModel("房屋实体类")
public class HouseEntity {

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 房屋名称
     */
    private String name;
    /**
     * 片区（核算单元id）
     */
    private Long areaUnitId;
    /**
     * 分局
     */
    private String station;
    /**
     * 房产名称
     */
    private String propertyName;
    /**
     * 资源id
     */
    private String resourceId;
    /**
     * 局站名称
     */
    private String stationName;
    /**
     * 局站编号
     */
    private String stationNo;
    /**
     * 局站地址
     */
    private String stationAddress;
    /**
     * 产权
     */
    private String propertyRight;
    /**
     * 是否删除 1：删除 0：未删除
     */
    private Integer isDeleted;
    /**
     * 创建时间
     */
    private String properties;

    private String type;
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

}
