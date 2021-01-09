/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.0
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : hesher

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 09/01/2021 21:24:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for left_menu
-- ----------------------------
DROP TABLE IF EXISTS `left_menu`;
CREATE TABLE `left_menu`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `menu_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `father_menu_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父菜单id',
  `menu_level` int(11) NULL DEFAULT NULL COMMENT '菜单等级，1级别，2级别，3级别',
  `menu_order` int(11) NULL DEFAULT NULL COMMENT '菜单排序',
  `menu_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单类型/child-跳出子菜单，jump-跳到其他页面，url-跳转到外部链接',
  `menu_jump_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '跳转附带信息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of left_menu
-- ----------------------------
INSERT INTO `left_menu` VALUES ('01ae699d5d514a8da0253e5a8568e2c6', '东东', 'f23bf574d67c484ab413685c64632677', 3, 1, 'jump', 'jumpUrl?page=teacher&id=91d780fb3d984ab8b514afd61d2b278e');
INSERT INTO `left_menu` VALUES ('01b008b3559c45a78f11578ac35cb4cd', '电吉他进阶课程', 'dad3608765104e8a842bc832236b320c', 2, 2, 'child', NULL);
INSERT INTO `left_menu` VALUES ('0aaf7024d1f1493092c0b51128a2459c', '更多课程', '3b05e525021142b0bba64a4a5d3d90f2', 2, 3, 'address2', 'otherclass.jpg');
INSERT INTO `left_menu` VALUES ('1c08a13805334f26b24f5315ff8b7e98', '小瑜', '344ed01903934ca29799471bb4b51a42', 3, 4, 'jump', 'jumpUrl?page=teacher&id=754f44e7a25c49f2b3cf12e67da7c6a9');
INSERT INTO `left_menu` VALUES ('1ca5f956e6054509874f46482e5e1a47', '商业合作', NULL, 1, 6, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('23148089e9d3438ca174f64c711641ac', '演出承接', '739dc32e4e28464eabc45254665bb33e', 2, 1, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('24d437c01fad48d1acfab5ccec3b67c9', '润润', '344ed01903934ca29799471bb4b51a42', 3, 2, 'jump', 'jumpUrl?page=teacher&id=4859f64dc48f4973bb59859957a2cfeb');
INSERT INTO `left_menu` VALUES ('344ed01903934ca29799471bb4b51a42', '电吉他初级课程', 'dad3608765104e8a842bc832236b320c', 2, 1, 'child', NULL);
INSERT INTO `left_menu` VALUES ('3b05e525021142b0bba64a4a5d3d90f2', '大班课程', NULL, 1, 3, 'child', NULL);
INSERT INTO `left_menu` VALUES ('4239d04521074bcc99fb9ebd1ee7a63a', '699十人小班', '3b05e525021142b0bba64a4a5d3d90f2', 2, 1, 'address2', '699_class_small.jpg');
INSERT INTO `left_menu` VALUES ('46bdf395aa754030a82e34ee22b254f8', '编曲录音服务', '739dc32e4e28464eabc45254665bb33e', 2, 4, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('4b2628f961644f6781dd93dbde9e22ac', '399五十人大班', '3b05e525021142b0bba64a4a5d3d90f2', 2, 2, 'address2', '399_class_big.jpg');
INSERT INTO `left_menu` VALUES ('4c3b0cc0cda7bd63782a9d58f7a5554c', '胡老师', '90e8999e1480862ca9b94550f57fe80b', 3, 1, 'jump', 'jumpUrl?page=teacher&id=01e751e80fa05c4484dcd5fd8cd0ad8d');
INSERT INTO `left_menu` VALUES ('500db9cdbb6a49aab4f3d215bcc778f3', '联系我们', NULL, 1, 7, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('53c37bc257e946679cc67cf2b450ef0d', '视频', NULL, 1, 4, 'jump', 'jumpUrl?page=video');
INSERT INTO `left_menu` VALUES ('63e9da63281148038ade41263b8c4be5', 'Hesher', '01b008b3559c45a78f11578ac35cb4cd', 3, 3, 'jump', 'jumpUrl?page=teacher&id=9beb7216b76346639447ef7994c00287');
INSERT INTO `left_menu` VALUES ('716bef347bc843b88d9962a7aa3ef0f1', '短视频运营', '739dc32e4e28464eabc45254665bb33e', 2, 2, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('739dc32e4e28464eabc45254665bb33e', '主营业务', NULL, 1, 2, 'child', NULL);
INSERT INTO `left_menu` VALUES ('779ba6b80c8e490083b58d7a8aed116c', '声乐课程', 'dad3608765104e8a842bc832236b320c', 2, 4, 'child', NULL);
INSERT INTO `left_menu` VALUES ('90e8999e1480862ca9b94550f57fe80b', '电贝司课程', 'dad3608765104e8a842bc832236b320c', 2, 5, 'child', NULL);
INSERT INTO `left_menu` VALUES ('ac05929a8cab46b8a68ba66b3253cd5d', '最新消息', NULL, 1, 1, 'wechatGong', NULL);
INSERT INTO `left_menu` VALUES ('c0582f04ef45498c95ca63d9c7401388', '丁老师', '779ba6b80c8e490083b58d7a8aed116c', 3, 1, 'jump', 'jumpUrl?page=teacher&id=7c9875b2e13d4e21b94c92ded8864b25');
INSERT INTO `left_menu` VALUES ('c238fc55680c4fc59c2652fcdf091506', '乐器设备销售', '739dc32e4e28464eabc45254665bb33e', 2, 3, 'address1', NULL);
INSERT INTO `left_menu` VALUES ('d644dc5816d347299874b6c29b43e6d4', '李楠', '01b008b3559c45a78f11578ac35cb4cd', 3, 1, 'jump', 'jumpUrl?page=teacher&id=ad1d8394b8284c8f872151f1bfaf195f');
INSERT INTO `left_menu` VALUES ('dad3608765104e8a842bc832236b320c', '开设课程', NULL, 1, 5, 'child', NULL);
INSERT INTO `left_menu` VALUES ('f23bf574d67c484ab413685c64632677', '木吉他(弹唱)课程', 'dad3608765104e8a842bc832236b320c', 2, 3, 'child', NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(11) NULL DEFAULT NULL COMMENT '1男性2女性',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `teacherShortInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师简介',
  `teacherInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师介绍',
  `teacherInfo2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师介绍2',
  `teacherInfo3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师介绍3',
  `ranking` int(11) NULL DEFAULT NULL COMMENT '推荐等级',
  `teacher_page_pic_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师介绍页面图片正方形',
  `teacher_page_pic_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师介绍页面长方形',
  `pic1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用于电脑端主页展示',
  `pic2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用于手机端主页展示',
  `pic3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pic4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pic5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `index_range` int(11) NULL DEFAULT NULL COMMENT '主页滑动展示排序',
  `index_show` int(11) NULL DEFAULT NULL COMMENT '是否主页展示0否1是',
  `instrument` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐器',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('01e751e80fa05c4484dcd5fd8cd0ad8d', '胡老师', 1, '10000', '技术派乐手，曾任数支重型乐队贝斯手，擅长各种风格的贝斯演奏。', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=841812047&bvid=BV1Y54y1e784&cid=227302593&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=242842404&bvid=BV1Te411s7FX&cid=179259919&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=91460944&bvid=BV1S7411u7cx&cid=156166195&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', 1, 'hulaoshi_teacher_page_pic1.jpg', 'hulaoshi_teacher_page_pic2.jpg', 'hulaoshi_index_web.jpg', 'hulaoshi_moble.jpg', NULL, NULL, NULL, 4, 1, '电贝斯');
INSERT INTO `teacher` VALUES ('4859f64dc48f4973bb59859957a2cfeb', '润润', 0, '10000', 'Solar吉他代言人 /中国地区形象大使 Valeton顽声效果器代言人', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">毕业于北京现代音乐学院，曾任变态少女乐队吉他手，Solar吉他代言人，Solar吉他中国地区形象大使，Valeton顽声效果器代言人。</p>', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=800052990&bvid=BV1Ny4y187Zk&cid=247369328&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<div class = \"teacher_page_show_er_pic\"></div>', 2, 'runrun_teacher_page_pic1.jpg', 'runrun_teacher_page_pic2.jpg', 'runrun_index_web.jpg', 'runrun_moble.jpg', NULL, NULL, NULL, 2, 1, '电吉他');
INSERT INTO `teacher` VALUES ('754f44e7a25c49f2b3cf12e67da7c6a9', '小瑜', 1, NULL, '毕业于北京现代音乐学院，现任激流金属乐队，处决乐队吉他手。擅长演奏前卫、金属风格的乐曲。', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">毕业于北京现代音乐学院，现任激流金属乐队，处决乐队吉他手。擅长演奏前卫、金属风格的乐曲。</p>', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=498625511&bvid=BV1bK411n7Hg&cid=206222025&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=12852671&bvid=BV1ix411H7w1&cid=21120088&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', 3, 'xiaoyu_teacher_page_pic1.jpg', 'xiaoyu_teacher_page_pic2.jpg', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '电吉他');
INSERT INTO `teacher` VALUES ('7c9875b2e13d4e21b94c92ded8864b25', '丁老师', 0, NULL, '毕业于北京现代音乐学院，自幼学习声乐，教学经验丰富。', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">毕业于北京现代音乐研修学院音乐制作专业、中国传媒大学远程与继续教育学院播音与主持艺术专业。</p>\r\n', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">自幼学习音乐，父母均为二十年以上专业声乐教育从业者。求学期间系统受过传统到现代、中西方多种唱法的训练。先后师从于北京现代音乐研修学院、上海音乐学院、上海戏剧学院等多位作曲编曲、声乐与表演教师。</p>\r\n', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">声乐是一个发展全面素养的专业，从技术审美到气质形象，从基本乐理到词曲制作，都是您音乐学习道路上的好伙伴。</p>', 1, 'ding_teacher_page_pic1.jpg', 'ding_teacher_page_pic1.jpg', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '声乐');
INSERT INTO `teacher` VALUES ('91d780fb3d984ab8b514afd61d2b278e', '东东', 1, '10000', '毕业于石家庄学院，现任石家庄韵律艺术项目经理，琴龄5年，演出经验丰富。', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">毕业于石家庄学院，现任石家庄韵律艺术项目经理，琴龄5年，演出经验丰富。</p>', '<div class = \"teacher_page_show_er_pic\"></div>', '<div class = \"teacher_page_show_er_pic\"></div>', 1, 'dongdong_techer_page_pic1.jpg', 'dongdong_techer_page_pic2.jpg', 'dongdong_index_web.jpg', 'dongdong_moble.jpg', NULL, NULL, NULL, NULL, NULL, '木吉他(弹唱)');
INSERT INTO `teacher` VALUES ('9beb7216b76346639447ef7994c00287', 'Hesher', 1, '10000', '海瑟文化CEO', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=38914888&bvid=BV1kt411k73f&cid=68396927&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=17945177&bvid=BV1LW411B7R1&cid=29296844&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=21276130&bvid=BV1UW411M76W&cid=34959298&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', 4, 'hesher_teacher_page_pic1.jpg', 'hesher_teacher_page_pic2.jpg', 'Hesher_index_main.jpg', 'Hesher_moble.jpg', NULL, NULL, NULL, 3, 1, '电吉他');
INSERT INTO `teacher` VALUES ('ad1d8394b8284c8f872151f1bfaf195f', '李楠', 1, '10000', 'ALP吉他、Peavey音响、Warwick贝斯以及Cleartone琴弦代言人', '<p id=\"teacher_info_1\" class=\"teacher_page_down_right_page_in_p\">毕业于中国传媒大学。1997年接触电吉他演奏至今已有23年之久。被誉为“中国最快吉他手”。涉猎风格广泛，涵盖爵士、布鲁斯、古典、金属。国内著名吉他手\\贝斯手\\录音、后期\\古典\\金属。APL吉他、Peavey音箱、Warwick贝斯以及Cleartone琴弦代言人</p>', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=50908503&bvid=BV1U4411475n&cid=89138599&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>\r\n', '<iframe class=\"teacher_page_video_show\" src=\"//player.bilibili.com/player.html?aid=795358583&bvid=BV19C4y1p7hY&cid=181378547&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', 1, 'lilan_teacher_page_pic1.jpg', 'lilan_teacher_page_pic2.jpg', 'linan_index_web.jpg', 'linan_moblie.jpg', NULL, NULL, NULL, 1, 1, '电吉他');

-- ----------------------------
-- Table structure for video_show
-- ----------------------------
DROP TABLE IF EXISTS `video_show`;
CREATE TABLE `video_show`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `video_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video_tittle_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video_tittle_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video_x` int(11) NULL DEFAULT NULL COMMENT '位置',
  `video_y` int(11) NULL DEFAULT NULL COMMENT '位置',
  `color` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小标题颜色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of video_show
-- ----------------------------
INSERT INTO `video_show` VALUES ('559e0b4b80cd4beea5d37f1b982283a6', '<iframe src=\"//player.bilibili.com/player.html?aid=841812047&bvid=BV1Y54y1e784&cid=227302593&page=1\" style=\"width: 100%; height: 100%\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', '胡老师', 'Video Show', 1, 0, '#ff5722');
INSERT INTO `video_show` VALUES ('826fda5d37234361b17fb5bb83c36d92', '<iframe src=\"//player.bilibili.com/player.html?aid=498625511&bvid=BV1bK411n7Hg&cid=206222025&page=1\" style=\"width: 100%; height: 100%\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', '小瑜', 'Video Show', 1, 1, '#ff5722');
INSERT INTO `video_show` VALUES ('9837fa476aeb41e9a46935c30fad5ed0', '<iframe loading=\"lazy\" src=\"http://player.bilibili.com/player.html?aid=201478471&bvid=BV1Fh411Z77v&cid=215559154&page=1\" style=\"width: 100%; height: 100%\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"></iframe>', 'Hesher', 'Video Show', 0, 0, '#ff5722');
INSERT INTO `video_show` VALUES ('d3b9c8c54ad540348145815136d81c8a', '<iframe src=\"//player.bilibili.com/player.html?aid=50908503&bvid=BV1U4411475n&cid=89138599&page=1\" style=\"width: 100%; height: 100%\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\"> </iframe>', '李楠', 'Vidoe Show', 0, 1, '#ff5722');

-- ----------------------------
-- Table structure for wechatgong
-- ----------------------------
DROP TABLE IF EXISTS `wechatgong`;
CREATE TABLE `wechatgong`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tittle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `url` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '链接url',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wechatgong
-- ----------------------------
INSERT INTO `wechatgong` VALUES ('0fa169cfb9d046d6b95a404d6f6f62a5', '即刻加入！超级吉他手扶持计划！', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483829&idx=1&sn=73d349e91c237156cff8bf89dc371692&chksm=9b802438acf7ad2e9891511bd859edce3432f85a947eb836f3ba68ad0181d1fe8104e8269d54&mpshare=1&scene=1&srcid=1205jcSObTik24jBXpzFiStd&sharer_sharetime=1607156553092&sharer_shareid=dbe875f97f371e3fb702f690c4f3c9c1&key=d15f9fba2045db20286e050ff24db020e6fba8fe753e1c8e5c923b6b531e398c157d540d52d675578b4050e46a89934e02dea739d2c24ada19b2550f67fc2a5c1a29a8c8e53a7e57bc587ba4cbc4d923fc07224abcc5b1de7bd36c6f2d5a4b77549052fba8d7c4d937846ecc29a756ca8e346ce1d6f35e59893f26ac53cfe4ee&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=63000039&lang=zh_CN&exportkey=A1NCZIZU%2Bq9DCcOmly%2BX%2BqA%3D&pass_ticket=sf7edX5kYw84FMScaFrTYuGzEXpvGjMj%2B58a7rtls3b%2F54TX6gOn2EHFIWLH2NmX&wx_header=0', '2020-10-08 16:26:07');
INSERT INTO `wechatgong` VALUES ('28969aec14334ff9824d874ab8934ac8', '「 爵士吉他的魅力 」', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483749&idx=1&sn=db6793cca1630b9e2b3ca82d0adb36fb&chksm=9b8024e8acf7adfe1093d11fe84990f1161d62c82b1a25727b02511be77dfc0e59912d49c0a2&scene=126&sessionid=1601067691&key=5e7686a5aca6468b35bda2c2d6cc906590c1abe80620c7f5fa20416140900b678a744fed0734343616a7857c883e9a5f16b5a323a3dec6a2a380ede4751ac1118bcb1219ae00689ff24a1e1dfa5b2a47755b54f0e1ede0213eed37a51adc4fa4af475d6a26cfed95ce391e63107552d6badd0bed76706dfc6268d5770acbaaf9&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A%2Bq2pCeVH0XNLwKXDATzESc%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-06-26 12:41:00');
INSERT INTO `wechatgong` VALUES ('4c73bc4c8668408b8cd35b289f5ae591', 'Kane & Lynch 2: Dog Days 游戏原声\n', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483742&idx=1&sn=16d415c61000b8ce91deabbb74ade284&chksm=9b8024d3acf7adc50731383eb880cef8cb7381f1b7e2665b644d968fb0c4c918a85267ca177d&scene=126&sessionid=1601067691&key=14beeba64fb9d287af6f6fc9b9c8943184bcb25281b32b34141a0b311dd42f43101b3a215b70030ce678de61d4be7acd8230d717245f244796f627576dbe5b2fb7cd7a02079dbef24765489f78b509641a5d64f66f3a0b7e2c448993c04d29b4d45c9c30084e20df38c7c6b35bb7e1e44f51bddd08797b2b399815e5c66c3d77&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A4Xc2vePFL74ZV%2FyWHuFzOc%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-04-21 11:17:00');
INSERT INTO `wechatgong` VALUES ('64e63379ad9f4504a04f026dbdfa0c25', 'Hesher Studio课程说明 (木吉他弹唱/电吉他）', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483774&idx=1&sn=e6704d0770276cd7b44a6185795ec076&chksm=9b8024f3acf7ade55ebbc2239ae306d47cd182bddd8b559eded33dce1d93e74cdef19b1d76c9&scene=126&sessionid=1601067691&key=5e7686a5aca6468b339d1c524df0eab696bcb1b7c5717364d575485d7313ca72d8c31ddbddd7ce08f8aaf4502217dcb0eb2b935830a8f3b91c48bfdd22d21c20bb9897dd100773103920f2a4ede83d72201e38edb6e7f4ffd054dc4f10e1e2cd0f40a1f198f5843725003560ba71c8ae00ab124c56040e15f47ab6a49448da08&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=AyH4mB%2BIGi0GabAH1BbmKg8%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-06-25 13:29:00');
INSERT INTO `wechatgong` VALUES ('c5020dc5083c485fac15201b7542b4f4', '学琴想省时省力？ 找我们就对了~', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483835&idx=1&sn=43b3e9ddc946b51dd42299151ea02ac3&chksm=9b802436acf7ad2041123ce1adaef14f0a85788aa50988f55cf3711cec7861c0d123e759baef&mpshare=1&scene=1&srcid=1205AC3BvRPioIZ8MvM7OdiX&sharer_sharetime=1607156541584&sharer_shareid=dbe875f97f371e3fb702f690c4f3c9c1&key=d15f9fba2045db20e089f66cbb0b6f323604d46aa8bf59fa80c7e101b12adff1b14cd2f57008934553ca2286ab93900a4b22aaedb76a8f394b94f956812fb88fd87cfd65c3dfe7c2dd2cec25047e10b50ebe6a019a7536fc9d52647e8bff15ea912595d89fb6f01b2926030561a1830bd4c358b9c002deb5214486be472eec0a&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=63000039&lang=zh_CN&exportkey=A5SnP6M8rDvlEQkLLydFUWs%3D&pass_ticket=sf7edX5kYw84FMScaFrTYuGzEXpvGjMj%2B58a7rtls3b%2F54TX6gOn2EHFIWLH2NmX&wx_header=0', '2020-10-10 16:25:34');
INSERT INTO `wechatgong` VALUES ('cbdde613a45d427f99f9199e968cd3f3', 'Hesher Studio 课程合伙人计划正式启动（长期有效）', 'https://mp.weixin.qq.com/s/P5tJ9ayxSZnxY9hh1LKXcg', '2020-10-02 15:49:34');
INSERT INTO `wechatgong` VALUES ('cc029f761bce49a98cfb459761ed3ae5', '致学员：你们的琴弦和拨片被我承包了', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483799&idx=1&sn=1dd2afc24dfaee7ca0ac362696b6dd11&chksm=9b80241aacf7ad0c4b09447c81c2be454bbb802983a8f6a1c31a73a723cafc9e7cc896f41362&scene=126&sessionid=1601067691&key=d68e5aea4b3446566bd7594c4d680ea53a5de8eee4c9bef24ae2de6c980f702996a7c3571e6bf809b3e5fe3e60f14ff454f2a4a2081a94744d6249a47fecf794043630f55abd0b3f26e82286596b511a84033bf40039a0a0154505ec8f7d8147659afd4761c366294273470d562ae1a09165164e12236070a5d1f6d104adb820&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A8BWyqgqPAQCSjOiZWHQxY0%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-07-18 14:36:00');
INSERT INTO `wechatgong` VALUES ('e8861177e69e4a9991fa5d0c15244e65', '新老师解锁！润润老师带你玩结他！', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483806&idx=1&sn=3e5cf194a934e7ba0078e9fe8706fcae&chksm=9b802413acf7ad05756a5002e82f454940bec734fbdf9783c90dd1fdf5682a1c70aeb1d452e9&scene=126&sessionid=1601067691&key=5e7686a5aca6468b27aa31b875e53b5f6b3c0a87ae89ce57315df8418a294bfa54391cb03b570117afea5cf894d0d7d6d8ed803a44198f28d1d7931c654b350954e62a46e548f83726d352d8b3c63702b02dd67fe96cacd47a514daf25bc0e22e45dce169d50cd284446b44183f4d3ea3b2c27776c64d1211bab78ef5da7ad9f&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A9ERhAOTs5UUCjRK7DPzsrk%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-08-25 15:30:00');
INSERT INTO `wechatgong` VALUES ('ec7907870ed2479d9860d6657c4f4c13', '这一次，您可以放心的学吉他了 。', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483811&idx=1&sn=882c9a7123ceb77334d50a92bd757eac&chksm=9b80242eacf7ad38f28076d1402b2657c8960d7209460e17062dfa7b09e2f13d97e2f89ac1b3&scene=126&sessionid=1601067691&key=e5059de1c2a6cb54bc58c0507507bc43c5b814810ff4064c54fe233d4725ede0df998ef3db00908e834f898a6ed7f39791bff7bf6dbb2b353a0e1a9ff6d765d11c431eb171637c9baa26e7c977ee08bb429a501fb7e1dce23ef76b906da8f233430f77a1de404e3d6c7c4cee7ca7b8b2faf47a1018b82e7f85f13e9ef76e5e39&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A%2BAA7c2UNSpXVVyr2Jr1vro%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-08-25 15:30:00');
INSERT INTO `wechatgong` VALUES ('efa8936ef39b4a00b19591c80e6d925d', '「 4/23 说唱推荐 」', 'https://mp.weixin.qq.com/s?__biz=MzAxNTYxMTEwNg==&mid=2247483755&idx=1&sn=af769fb191a6650b8963633bdb126ea5&chksm=9b8024e6acf7adf05579d944445b900e2092e22482a917d80e161fcd01891d16fdf3f2703e25&scene=126&sessionid=1601067691&key=5e7686a5aca6468b002295e697f5400820a4c06fca4dbdd8b89ec9e55355d3818c8eb706830e4db4b93d023b0ef0bc26a6b4193751ebe1f4fa19629221ab62bd920abf603dbf874e81cf23bfcb8a2a0a52e08a4f9dc1aa5f974212bdc1d553ef40cb81fb3f4e7d6343e29414ff41721768d5ebb38057aac5e2f0cace5bcc2dbf&ascene=1&uin=MTM3NjAyMDc3NA%3D%3D&devicetype=Windows+10+x64&version=62090538&lang=zh_CN&exportkey=A%2BULFoZ78UNzw3zlJupPMBk%3D&pass_ticket=KXkeWonTgaD2pmuPu%2FoR%2F524g2m7tnKJsyi9RYqA2MyO2Tv0%2Bb2qqNqIdpk86%2BHr&wx_header=0', '2020-04-23 11:25:00');

SET FOREIGN_KEY_CHECKS = 1;
