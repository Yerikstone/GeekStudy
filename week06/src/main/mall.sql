/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306_01
Source Server Version : 50715
Source Host           : 127.0.0.1:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2021-06-13 00:13:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL,
  `goods_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `goods_price` decimal(11,2) DEFAULT NULL COMMENT '商品单价',
  `desc` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表';

-- ----------------------------
-- Table structure for order_sub
-- ----------------------------
DROP TABLE IF EXISTS `order_sub`;
CREATE TABLE `order_sub` (
  `id` bigint(32) NOT NULL COMMENT '订单号',
  `user_id` bigint(32) DEFAULT NULL,
  `goods_id` bigint(32) DEFAULT NULL,
  `goods_num` int(11) DEFAULT NULL COMMENT '订单数量',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单子表';

-- ----------------------------
-- Table structure for order_total
-- ----------------------------
DROP TABLE IF EXISTS `order_total`;
CREATE TABLE `order_total` (
  `id` bigint(32) NOT NULL,
  `order_id` bigint(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(32) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_pwd` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';
