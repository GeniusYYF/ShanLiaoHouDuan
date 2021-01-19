/*
 Navicat MySQL Data Transfer

 Source Server         : Database1
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 19/01/2021 10:27:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for desc
-- ----------------------------
DROP TABLE IF EXISTS `desc`;
CREATE TABLE `desc`  (
  `descId` int NOT NULL AUTO_INCREMENT,
  `myId` int NULL DEFAULT NULL,
  `myMsg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `youId` int NULL DEFAULT NULL,
  `youMsg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`descId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of desc
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `token` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
