package com.henu.paperadmin.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangjinhu
 * @since 2019-06-16
 */
@TableName("pap_plan")
public class PlanDO extends Model<PlanDO> {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 计划说明
     */
    private String description;
    /**
     * 对应角色
     */
    @TableField("role_id")
    private Long roleId;
    /**
     * 文件存储地址
     */
    @TableField("file_path")
    private String filePath;
    /**
     * 上传时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 上传者
     */
    @TableField("create_user")
    private String createUser;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PapPlan{" +
                ", id=" + id +
                ", description=" + description +
                ", roleId=" + roleId +
                ", filePath=" + filePath +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", createUser=" + createUser +
                "}";
    }
}