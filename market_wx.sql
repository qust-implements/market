# Host: localhost  (Version 5.7.20-log)
# Date: 2019-08-01 15:25:29
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "banner"
#

DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT 'null',
  `_info` varchar(255) NOT NULL DEFAULT 'null',
  `_url` varchar(255) NOT NULL DEFAULT 'null',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "banner"
#


#
# Structure for table "collection"
#

DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_uid` int(11) NOT NULL DEFAULT '0',
  `_gid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "collection"
#


#
# Structure for table "comment"
#

DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_desc` varchar(255) NOT NULL DEFAULT 'null',
  `_time` bigint(1) NOT NULL DEFAULT '0',
  `_uid` varchar(255) NOT NULL DEFAULT '0',
  `_gid` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "comment"
#


#
# Structure for table "file_form"
#

DROP TABLE IF EXISTS `file_form`;
CREATE TABLE `file_form` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_file_name` varchar(255) NOT NULL DEFAULT 'null',
  `_url` varchar(255) NOT NULL DEFAULT 'null',
  `_type_id` int(11) NOT NULL DEFAULT '0',
  `_table` varchar(255) NOT NULL DEFAULT 'null',
  `_table_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "file_form"
#


#
# Structure for table "file_type"
#

DROP TABLE IF EXISTS `file_type`;
CREATE TABLE `file_type` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT 'null',
  `_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "file_type"
#


#
# Structure for table "goods"
#

DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT 'null',
  `_info` varchar(255) NOT NULL DEFAULT 'null',
  `_price` double NOT NULL DEFAULT '0',
  `_time` varchar(255) NOT NULL DEFAULT 'null',
  `_uid` int(11) NOT NULL DEFAULT '0',
  `_classid` int(11) NOT NULL DEFAULT '0',
  `_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "goods"
#


#
# Structure for table "goods_class"
#

DROP TABLE IF EXISTS `goods_class`;
CREATE TABLE `goods_class` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT 'null',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "goods_class"
#


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_name` varchar(255) NOT NULL DEFAULT '',
  `_address` varchar(255) NOT NULL DEFAULT 'null',
  `_school` varchar(255) NOT NULL DEFAULT 'null',
  `_phone` varchar(255) NOT NULL DEFAULT 'null',
  `_sex` int(11) NOT NULL DEFAULT '0',
  `_icon_id` varchar(255) NOT NULL DEFAULT '0',
  `_true_name` varchar(255) NOT NULL DEFAULT 'null',
  `_qq` varchar(255) NOT NULL DEFAULT 'null',
  `_wechat` varchar(255) NOT NULL DEFAULT 'null',
  `_active` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

