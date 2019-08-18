# Host: localhost  (Version 5.7.20-log)
# Date: 2019-08-15 10:40:55
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "t_dept"
#

DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `DEPT_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级部门ID',
  `DEPT_NAME` varchar(100) NOT NULL COMMENT '部门名称',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`DEPT_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='部门表';

#
# Data for table "t_dept"
#


#
# Structure for table "t_log"
#

DROP TABLE IF EXISTS `t_log`;
CREATE TABLE `t_log` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `USERNAME` varchar(50) DEFAULT NULL COMMENT '操作用户',
  `OPERATION` text COMMENT '操作内容',
  `TIME` decimal(11,0) DEFAULT NULL COMMENT '耗时',
  `METHOD` text COMMENT '操作方法',
  `PARAMS` text COMMENT '方法参数',
  `IP` varchar(64) DEFAULT NULL COMMENT '操作者IP',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `location` varchar(50) DEFAULT NULL COMMENT '操作地点',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='操作日志表';

#
# Data for table "t_log"
#


#
# Structure for table "t_login_log"
#

DROP TABLE IF EXISTS `t_login_log`;
CREATE TABLE `t_login_log` (
  `ID` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `USERNAME` varchar(50) NOT NULL COMMENT '用户名',
  `LOGIN_TIME` datetime NOT NULL COMMENT '登录时间',
  `LOCATION` varchar(50) DEFAULT NULL COMMENT '登录地点',
  `IP` varchar(50) DEFAULT NULL COMMENT 'IP地址',
  `SYSTEM` varchar(50) DEFAULT NULL COMMENT '操作系统',
  `BROWSER` varchar(50) DEFAULT NULL COMMENT '浏览器',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='登录日志表';

#
# Data for table "t_login_log"
#


#
# Structure for table "t_menu"
#

DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `MENU_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单/按钮ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级菜单ID',
  `MENU_NAME` varchar(50) NOT NULL COMMENT '菜单/按钮名称',
  `URL` varchar(50) DEFAULT NULL COMMENT '菜单URL',
  `PERMS` text COMMENT '权限标识',
  `ICON` varchar(50) DEFAULT NULL COMMENT '图标',
  `TYPE` char(2) NOT NULL COMMENT '类型 0菜单 1按钮',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`MENU_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单表';

#
# Data for table "t_menu"
#


#
# Structure for table "t_role"
#

DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `ROLE_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `ROLE_NAME` varchar(100) NOT NULL COMMENT '角色名称',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`ROLE_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色表';

#
# Data for table "t_role"
#


#
# Structure for table "t_role_menu"
#

DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu` (
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID',
  `MENU_ID` bigint(20) NOT NULL COMMENT '菜单/按钮ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色菜单关联表';

#
# Data for table "t_role_menu"
#


#
# Structure for table "t_user"
#

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(50) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(128) NOT NULL COMMENT '密码',
  `DEPT_ID` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `STATUS` char(1) NOT NULL COMMENT '状态 0锁定 1有效',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最近访问时间',
  `SSEX` char(1) DEFAULT NULL COMMENT '性别 0男 1女 2保密',
  `IS_TAB` char(1) DEFAULT NULL COMMENT '是否开启tab，0关闭 1开启',
  `THEME` varchar(10) DEFAULT NULL COMMENT '主题',
  `AVATAR` varchar(100) DEFAULT NULL COMMENT '头像',
  `DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

#
# Data for table "t_user"
#


#
# Structure for table "t_user_role"
#

DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `USER_ID` bigint(20) NOT NULL COMMENT '用户ID',
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户角色关联表';

#
# Data for table "t_user_role"
#


#
# Structure for table "tb_banner"
#

DROP TABLE IF EXISTS `tb_banner`;
CREATE TABLE `tb_banner` (
  `IMG_ID` bigint(20) NOT NULL,
  `IMG_NAME` varchar(255) NOT NULL,
  `IMG_INFO` varchar(255) NOT NULL,
  `IMG_URL` varchar(255) NOT NULL,
  `IMG_STATE` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`IMG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_banner"
#

INSERT INTO `tb_banner` VALUES (1,'1','1','/images/1.jpg',1),(2,'2','2','/images/2.jpg',1),(3,'3','3','/images/3.jpg',1),(4,'4','4','/images/4.jpg',1);

#
# Structure for table "tb_category"
#

DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category` (
  `CATE_ID` bigint(20) NOT NULL,
  `PARENT_ID` bigint(20) NOT NULL,
  `CATE_NAME` varchar(255) NOT NULL,
  `ORDER_NUM` bigint(20) NOT NULL,
  `CREATE_TIME` bigint(20) NOT NULL,
  `MODIFY_TIME` bigint(20) NOT NULL,
  PRIMARY KEY (`CATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_category"
#

INSERT INTO `tb_category` VALUES (1,0,'代步工具',0,0,0),(2,0,'3C数码',0,0,0),(3,0,'衣鞋伞帽',0,0,0),(4,0,'书籍教材',0,0,0),(5,0,'女神专区',0,0,0),(6,0,'测试数据',0,0,0);

#
# Structure for table "tb_collection"
#

DROP TABLE IF EXISTS `tb_collection`;
CREATE TABLE `tb_collection` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_uid` int(11) NOT NULL DEFAULT '0',
  `_gid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_collection"
#

INSERT INTO `tb_collection` VALUES (1,2,1);

#
# Structure for table "tb_discuss"
#

DROP TABLE IF EXISTS `tb_discuss`;
CREATE TABLE `tb_discuss` (
  `DISCUSS_ID` bigint(20) NOT NULL,
  `DISCUSS_DESC` varchar(255) NOT NULL,
  `DISCUSS_TIME` bigint(20) NOT NULL,
  `USER_ID` bigint(20) NOT NULL,
  `STUFF_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`DISCUSS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_discuss"
#

INSERT INTO `tb_discuss` VALUES (1,'一个二手小灯还敢卖原价？',0,2,1);

#
# Structure for table "tb_file_type"
#

DROP TABLE IF EXISTS `tb_file_type`;
CREATE TABLE `tb_file_type` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT 'null',
  `_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "tb_file_type"
#

INSERT INTO `tb_file_type` VALUES (1,'用户上传物品图片',1);

#
# Structure for table "tb_file_form"
#

DROP TABLE IF EXISTS `tb_file_form`;
CREATE TABLE `tb_file_form` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_file_name` varchar(255) NOT NULL DEFAULT 'null',
  `_url` varchar(255) NOT NULL DEFAULT 'null',
  `_type_id` int(11) NOT NULL DEFAULT '0',
  `_table` varchar(255) NOT NULL DEFAULT 'null',
  `_table_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`),
  KEY `_type_id` (`_type_id`),
  CONSTRAINT `tb_file_form_ibfk_1` FOREIGN KEY (`_type_id`) REFERENCES `tb_file_type` (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

#
# Data for table "tb_file_form"
#

INSERT INTO `tb_file_form` VALUES (1,'1','goods_images/1.jpg',1,'tb_stuff',1),(2,'2','goods_images/1.jpg',1,'tb_stuff',2),(3,'1','goods_images/1.jpg',1,'tb_stuff',3),(4,'2','goods_images/1.jpg',1,'tb_stuff',4),(5,'1','goods_images/2.jpg',1,'tb_stuff',5),(6,'1','goods_images/1.jpg',1,'tb_stuff',6),(7,'1','goods_images/1.jpg',1,'tb_stuff',7),(8,'1','goods_images/1.jpg',1,'tb_stuff',8),(9,'1','goods_images/1.jpg',1,'tb_stuff',9),(10,'1','goods_images/1.jpg',1,'tb_stuff',10),(11,'1','goods_images/1.jpg',1,'tb_stuff',11),(12,'1','goods_images/1.jpg',1,'tb_stuff',12),(13,'1','goods_images/1.jpg',1,'tb_stuff',13),(14,'1','goods_images/1.jpg',1,'tb_stuff',14),(15,'1','goods_images/1.jpg',1,'tb_stuff',15),(16,'1','goods_images/1.jpg',1,'tb_stuff',16),(17,'1','goods_images/1.jpg',1,'tb_stuff',17),(18,'1','goods_images/1.jpg',1,'tb_stuff',18),(19,'1','goods_images/1.jpg',1,'tb_stuff',19),(20,'1','goods_images/1.jpg',1,'tb_stuff',20),(21,'1','goods_images/1.jpg',1,'tb_stuff',21),(22,'1','goods_images/1.jpg',1,'tb_stuff',5),(23,'1','goods_images/1.jpg',1,'tb_stuff',6),(24,'1','goods_images/1.jpg',1,'tb_stuff',7),(25,'1','goods_images/1.jpg',1,'tb_stuff',8),(26,'1','goods_images/1.jpg',1,'tb_stuff',9),(27,'1','goods_images/1.jpg',1,'tb_stuff',10),(28,'1','goods_images/1.jpg',1,'tb_stuff',11),(29,'1','goods_images/1.jpg',1,'tb_stuff',12),(30,'1','goods_images/1.jpg',1,'tb_stuff',13),(31,'1','goods_images/1.jpg',1,'tb_stuff',14),(32,'1','goods_images/1.jpg',1,'tb_stuff',15),(33,'1','goods_images/1.jpg',1,'tb_stuff',16),(34,'1','goods_images/1.jpg',1,'tb_stuff',17),(35,'1','goods_images/1.jpg',1,'tb_stuff',18),(36,'1','goods_images/1.jpg',1,'tb_stuff',19),(37,'1','goods_images/1.jpg',1,'tb_stuff',20),(38,'1','goods_images/1.jpg',1,'tb_stuff',21),(39,'1','goods_images/1.jpg',1,'tb_stuff',5),(40,'1','goods_images/1.jpg',1,'tb_stuff',6),(41,'1','goods_images/1.jpg',1,'tb_stuff',7),(42,'1','goods_images/1.jpg',1,'tb_stuff',8),(43,'1','goods_images/1.jpg',1,'tb_stuff',9),(44,'1','goods_images/1.jpg',1,'tb_stuff',10),(45,'1','goods_images/1.jpg',1,'tb_stuff',11),(46,'1','goods_images/1.jpg',1,'tb_stuff',12),(47,'1','goods_images/1.jpg',1,'tb_stuff',13),(48,'1','goods_images/1.jpg',1,'tb_stuff',14),(49,'1','goods_images/1.jpg',1,'tb_stuff',15),(50,'1','goods_images/1.jpg',1,'tb_stuff',16),(51,'1','goods_images/1.jpg',1,'tb_stuff',17),(52,'1','goods_images/1.jpg',1,'tb_stuff',18),(53,'1','goods_images/1.jpg',1,'tb_stuff',19),(54,'1','goods_images/1.jpg',1,'tb_stuff',20),(55,'1','goods_images/1.jpg',1,'tb_stuff',21);

#
# Structure for table "tb_session"
#

DROP TABLE IF EXISTS `tb_session`;
CREATE TABLE `tb_session` (
  `_id` varchar(255) NOT NULL DEFAULT 'null',
  `_session_key` varchar(255) NOT NULL DEFAULT 'null',
  `_token` varchar(255) NOT NULL DEFAULT 'null',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_session"
#

INSERT INTO `tb_session` VALUES ('ow2yH5Cw0pdipQ5qo7VmpeaCfiA8','Y8tRyA3fe0gwPjsgxvWvyA==','b52ce78bef3147fd9e8f04f36424daf4'),('ow2yH5FGFN0jRc7USccQdnvtnrb8','fF0D19F2511/+T9vA7J2Jw==','c876a69392c0486f85170cdf3a21b566'),('ow2yH5JHqbDyTNO8oNKbxHqjLAcM','PQ+m+MOqabHYUyIEJlgJGg==','11b54bd834394923826b6c74628dd379');

#
# Structure for table "tb_stuff"
#

DROP TABLE IF EXISTS `tb_stuff`;
CREATE TABLE `tb_stuff` (
  `STUFF_ID` bigint(20) NOT NULL,
  `STUFF_NAME` varchar(255) NOT NULL,
  `STUFF_INFO` varchar(255) NOT NULL DEFAULT '',
  `STUFF_PRICE` double NOT NULL,
  `STUFF_ACTIVE` int(11) NOT NULL,
  `USER_ID` bigint(20) NOT NULL,
  `CATE_ID` bigint(20) NOT NULL,
  `CREATE_TIME` bigint(20) NOT NULL,
  `MODIFY_TIME` bigint(20) NOT NULL,
  PRIMARY KEY (`STUFF_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_stuff"
#

INSERT INTO `tb_stuff` VALUES (1,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(2,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(3,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(4,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(5,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(6,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(7,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(8,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(9,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(10,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(11,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(12,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(13,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(14,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(15,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(16,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(17,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(18,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(19,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(20,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0),(21,'小米usb灯','自用小米usb灯，官网9.9',5,1,2,2,0,0);

#
# Structure for table "tb_user"
#

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_openid` varchar(255) NOT NULL DEFAULT 'null',
  `_nickName` varchar(255) NOT NULL DEFAULT '',
  `_address` varchar(255) NOT NULL DEFAULT 'null',
  `_school` varchar(255) NOT NULL DEFAULT 'null',
  `_phone` varchar(255) NOT NULL DEFAULT 'null',
  `_gender` int(11) NOT NULL DEFAULT '0',
  `_city` varchar(255) NOT NULL DEFAULT 'null',
  `_province` varchar(255) NOT NULL DEFAULT 'null',
  `_country` varchar(255) NOT NULL DEFAULT 'null',
  `_avatarUrl` varchar(255) NOT NULL DEFAULT 'null',
  `_true_name` varchar(255) NOT NULL DEFAULT 'null',
  `_qq` varchar(255) NOT NULL DEFAULT 'null',
  `_wechat` varchar(255) NOT NULL DEFAULT 'null',
  `_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "tb_user"
#

INSERT INTO `tb_user` VALUES (1,'ow2yH5FGFN0jRc7USccQdnvtnrb8','水长东','null','null','null',1,'Dongying','Shandong','China','https://wx.qlogo.cn/mmopen/vi_32/RCmX0wePqPuQA9dAusZibwniav9tia38nPXytIEVZbw5SicJuibcKZ3zJjGAG8qFyLO72PsA4YHDFtD7Wic1G7ibA5wcA/132','null','null','null',1),(2,'ow2yH5JHqbDyTNO8oNKbxHqjLAcM','King.','null','null','null',1,'Xuchang','Henan','China','https://wx.qlogo.cn/mmopen/vi_32/pWwBxLiaibqibPndwrmSFTHGsUy5ySQ47jb4DmWlka3yiceRIZ5UWIMDtlAPNDGTOMXTgddGqoRMCmPmWoTw8hrmog/132','null','null','null',1),(3,'ow2yH5Cw0pdipQ5qo7VmpeaCfiA8','Nightliu','null','null','null',2,'Jining','Shandong','China','https://wx.qlogo.cn/mmopen/vi_32/3jYshTVp4r0dFyiaPf4WSH1DiboE0xUOytbsRibPBdsROBDAuQJADeGib4FQHQhiaHvqSvlI8SOVicibYEW0nR1PzJzoQ/132','null','null','null',1);
