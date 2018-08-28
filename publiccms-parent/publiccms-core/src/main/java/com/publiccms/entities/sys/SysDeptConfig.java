package com.publiccms.entities.sys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDeptConfig generated by hbm2java
 */
@Entity
@Table(name = "sys_dept_config")
@DynamicUpdate
public class SysDeptConfig implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysDeptConfigId id;

    public SysDeptConfig() {
    }

    public SysDeptConfig(SysDeptConfigId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "deptId", column = @Column(name = "dept_id", nullable = false)),
            @AttributeOverride(name = "config", column = @Column(name = "config", nullable = false)) })
    public SysDeptConfigId getId() {
        return this.id;
    }

    public void setId(SysDeptConfigId id) {
        this.id = id;
    }

}