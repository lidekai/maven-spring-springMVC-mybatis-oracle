/*
 Navicat Premium Data Transfer

 Source Server         : LinuxOracle
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 10.10.2.4:1521
 Source Schema         : SSM

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 11/01/2019 17:00:33
*/


-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE "SSM"."test";
CREATE TABLE "SSM"."test" (
  "testID" VARCHAR2(10 BYTE) NOT NULL ,
  "testName" VARCHAR2(20 BYTE) ,
  "testSex" VARCHAR2(20 BYTE) ,
  "testAge" VARCHAR2(10 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Checks structure for table test
-- ----------------------------
ALTER TABLE "SSM"."test" ADD CONSTRAINT "SYS_C0011053" CHECK ("testID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
