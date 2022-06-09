-- ----------------------------
-- 将官网例子集成到flyway
-- 20220601 bswsf
-- ----------------------------
CREATE TABLE If NOT EXISTS`car`  (
  `car_id` bigint(20) NOT NULL COMMENT '车辆id',
  `car_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆名称',
  `car_type` tinyint(4) NULL DEFAULT NULL COMMENT '车辆种类：1-轿车，2-货车',
  `car_color` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆颜色',
  `car_price` decimal(20, 2) NULL DEFAULT NULL COMMENT '车辆价格',
  `manufacturer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '制造商',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user` bigint(20) NULL DEFAULT NULL COMMENT '创建人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `update_user` bigint(20) NULL DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`car_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '车辆管理' ROW_FORMAT = Dynamic;
INSERT INTO `car` (car_id, car_name, car_type, car_color,car_price,manufacturer,create_time,create_user,update_time,update_user)
SELECT 1339554696976782409, '奥迪A6', 1, '白色', 300000.00, '奥迪公司', '2021-02-06 17:06:33', NULL, NULL, NULL
from DUAL
where not exists(select car_id from `car` where car_id=1339554696976782409);
INSERT INTO `car` (car_id, car_name, car_type, car_color,car_price,manufacturer,create_time,create_user,update_time,update_user)
SELECT 1339554696976782410, '奥迪A6', 1, '白色', 300000.00, '奥迪公司', '2021-02-06 17:06:33', NULL, NULL, NULL
from DUAL
where not exists(select car_id from `car` where car_id=1339554696976782410);
