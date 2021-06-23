package com.example.kpi202106demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="Company实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ss_company")
public class Company implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="ID")
    private String id;

    /**
     * 公司名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="公司名称")
    private String name;

    /**
     * 到期时间
     */
    @TableField(value = "expiration_date")
    @ApiModelProperty(value="到期时间")
    private Date expirationDate;

    /**
     * 公司地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="公司地址")
    private String address;

    /**
     * 营业执照-图片
     */
    @TableField(value = "license_id")
    @ApiModelProperty(value="营业执照-图片")
    private String licenseId;

    /**
     * 法人代表
     */
    @TableField(value = "representative")
    @ApiModelProperty(value="法人代表")
    private String representative;

    /**
     * 公司电话
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="公司电话")
    private String phone;

    /**
     * 公司规模
     */
    @TableField(value = "company_size")
    @ApiModelProperty(value="公司规模")
    private String companySize;

    /**
     * 所属行业
     */
    @TableField(value = "industry")
    @ApiModelProperty(value="所属行业")
    private String industry;

    /**
     * 备注
     */
    @TableField(value = "remarks")
    @ApiModelProperty(value="备注")
    private String remarks;

    /**
     * 状态
     */
    @TableField(value = "state")
    @ApiModelProperty(value="状态")
    private Integer state;

    /**
     * 当前余额
     */
    @TableField(value = "balance")
    @ApiModelProperty(value="当前余额")
    private Double balance;

    @TableField(value = "city")
    @ApiModelProperty(value="")
    private String city;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_EXPIRATION_DATE = "expiration_date";

    public static final String COL_ADDRESS = "address";

    public static final String COL_LICENSE_ID = "license_id";

    public static final String COL_REPRESENTATIVE = "representative";

    public static final String COL_PHONE = "phone";

    public static final String COL_COMPANY_SIZE = "company_size";

    public static final String COL_INDUSTRY = "industry";

    public static final String COL_REMARKS = "remarks";

    public static final String COL_STATE = "state";

    public static final String COL_BALANCE = "balance";

    public static final String COL_CITY = "city";
}