/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.example.week7multidatasrc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-06-20 20:07
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
@Data
@TableName("s_order")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SOrder   extends Model<SOrder> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("order_id")
    private Long orderId;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
