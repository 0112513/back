CREATE DATABASE IF NOT EXISTS `airplainticket` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;


--CREATE TABLE IF NOT EXISTS `user` (
CREATE TABLE IF NOT EXISTS `airplain_info` (
  `airplain_id` int NOT NULL AUTO_INCREMENT,
  `departure_date` datetime NOT NULL,
  `arrival_date` datetime NOT NULL,
  `departure_location` varchar(45) NOT NULL,
  `arrival_location` varchar(45) NOT NULL,
  `price` int NOT NULL,
  `class_type` varchar(45) NOT NULL,
  `seat` varchar(50) NOT NULL,
  `is_oneway` tinyint NOT NULL,
  PRIMARY KEY (`airplain_id`,`class_type`),
  UNIQUE KEY `airplain_id_UNIQUE` (`airplain_id`)
)

CREATE TABLE IF NOT EXISTS`order_by` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `is_oneway` tinyint NOT NULL DEFAULT '0',
  `number_of_people` int NOT NULL,
  `arrival_date` datetime NOT NULL,
  `departure_date` datetime NOT NULL,
  `arrival_location` varchar(200) NOT NULL,
  `departure_location` varchar(200) NOT NULL,
  `class_type` varchar(45) NOT NULL,
  `price` int NOT NULL,
  PRIMARY KEY (`order_id`)
) 

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `email` varchar(45) NOT NULL,
  `point` int NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `member_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



