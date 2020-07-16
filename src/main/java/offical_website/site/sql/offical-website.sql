-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.4.11-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 offical_website 的数据库结构
DROP DATABASE IF EXISTS `offical_website`;
CREATE DATABASE IF NOT EXISTS `offical_website` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `offical_website`;

-- 导出  表 offical_website.cases 结构
DROP TABLE IF EXISTS `cases`;
CREATE TABLE IF NOT EXISTS `cases` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `img` longtext DEFAULT NULL,
  `title` longtext DEFAULT NULL,
  `content` longtext DEFAULT NULL,
  `createTime` datetime(6) DEFAULT current_timestamp(6),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.cases 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `cases` DISABLE KEYS */;
REPLACE INTO `cases` (`Id`, `img`, `title`, `content`, `createTime`, `isDeleted`) VALUES
	(1, '/imageStore/ffee6e13-bdad-46e3-9496-9d1dc0ba1240.jpg', '上海市公共安全教育实训基地项目位', '位于上海市青浦区沪青平公路6888号“东方绿舟”东南 角，四界范围为：东临城市河道，南至沪青平公路，西界绿湖路，北靠现有的东方绿舟停机 坪。项目用地面积65048平方米（以实测为准），新建总建筑面积约为26467平方米（地上 23500平方米，地下2967平方米）', '2020-07-15 14:54:01.000000', 0);
/*!40000 ALTER TABLE `cases` ENABLE KEYS */;

-- 导出  表 offical_website.course 结构
DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `year` longtext DEFAULT NULL,
  `content` longtext DEFAULT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.course 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
REPLACE INTO `course` (`id`, `year`, `content`, `isDeleted`) VALUES
	(1, '2012年9月', '上海韭菜工程管理股份有限公司“工程管理标准化+互联网协作平台“开发上线，并成功投入项目使用。', 0);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;

-- 导出  表 offical_website.dictionary 结构
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE IF NOT EXISTS `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dictKey` longtext DEFAULT NULL,
  `content` longtext DEFAULT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.dictionary 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `dictionary` DISABLE KEYS */;
REPLACE INTO `dictionary` (`id`, `dictKey`, `content`, `isDeleted`) VALUES
	(1, '首页主标题', '立人立己 达人达己', 0);
/*!40000 ALTER TABLE `dictionary` ENABLE KEYS */;

-- 导出  表 offical_website.enterprise 结构
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE IF NOT EXISTS `enterprise` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `img` longtext DEFAULT NULL,
  `remark` longtext DEFAULT NULL,
  `createTime` datetime(6) DEFAULT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.enterprise 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `enterprise` DISABLE KEYS */;
REPLACE INTO `enterprise` (`Id`, `img`, `remark`, `createTime`, `isDeleted`) VALUES
	(1, '/imageStore/a9f64635-824b-4da1-8548-0dd53d00ede4.jpg', '企业名称222', NULL, 0);
/*!40000 ALTER TABLE `enterprise` ENABLE KEYS */;

-- 导出  表 offical_website.honor 结构
DROP TABLE IF EXISTS `honor`;
CREATE TABLE IF NOT EXISTS `honor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` longtext DEFAULT NULL,
  `remark` longtext DEFAULT NULL,
  `createTime` datetime(6) DEFAULT current_timestamp(6),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.honor 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `honor` DISABLE KEYS */;
REPLACE INTO `honor` (`id`, `img`, `remark`, `createTime`, `isDeleted`) VALUES
	(1, '/imageStore/a9f64635-824b-4da1-8548-0dd53d00ede4.jpg', '高新成果转化证书', '2020-07-16 14:04:12.058079', 0);
/*!40000 ALTER TABLE `honor` ENABLE KEYS */;

-- 导出  表 offical_website.news 结构
DROP TABLE IF EXISTS `news`;
CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` longtext DEFAULT NULL,
  `img` longtext DEFAULT NULL,
  `type` int(11) NOT NULL,
  `content` longtext DEFAULT NULL,
  `createTime` datetime(6) DEFAULT current_timestamp(6),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.news 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
REPLACE INTO `news` (`id`, `title`, `img`, `type`, `content`, `createTime`, `isDeleted`) VALUES
	(1, '热烈祝贺上海韭菜获得上海市工程监理资质', '/imageStore/ffee6e13-bdad-46e3-9496-9d1dc0ba1240.jpg', 1, '热烈祝贺上海韭菜工程管理股份有限公司获得上海市工程监理资质证书(房屋建筑工程和市政公用工程）!', '2020-07-16 11:22:03.692432', 0),
	(2, '国务院安委会办公室关于2018年上半年全国建筑业安全生产形势的通报', '/imageStore/ffee6e13-bdad-46e3-9496-9d1dc0ba1240.jpg', 2, '国务院安委会办公室关于2018年上半年全国建筑业安全生产形势的通报\\n\\n安委办函〔2018〕67号\\n\\n各省、自治区、直辖市及新疆生产建设兵团安全生产委员会，国务院安委会有关成员单位，有关中央企业：\\n\\n2018年上半年，各地区、各有关部门以及中央企业认真贯彻落实党中央、国务院关于安全生产工作的决策部署，加大建筑业安全监管力度，健全安全生产责任体系，强化专项整治和隐患排查治理，建筑业安全生产形势总体稳定，但事故总量同比增加，且发生1起重大事故，安全生产形势依然严峻复杂。现将有关情况通报如下：\\n\\n一、上半年建筑业安全生产形势\\n\\n（一）事故总量持续保持在高位。上半年全国建筑业共发生生产安全事故1732起、死亡1752人，同比分别上升7.8%和1.4%，事故总量已连续9年排在工矿商贸事故第一位，事故起数和死亡人数自2016年起连续“双上升”；较大事故发生32起、死亡113人，同比分别下降17.9%和26.1%；重大事故发生1起，同比持平。\\n\\n（二）部分地区和行业领域较大事故多发。上半年共有18个省份发生建筑业较大以上事故，其中9个省份发生2起及以上较大事故。房屋建筑及市政工程领域的较大事故占比最大，其余较大事故主要发生在交通建设工程、电力建设工程领域。\\n\\n（三）高处坠落和坍塌是事故主要类型。在一般事故中，高处坠落事故占全部事故总数的48.2%，物体打击占13.6%，其他分别为坍塌、触电、机械伤害等。在较大事故中，坍塌事故起数占总数的45.1%，其余分别为高处坠落、中毒窒息、物体打击等。唯一的1起重大事故为坍塌事故。\\n\\n（四）中央企业较大以上事故多发。上半年共有6家中央企业发生了8起较大事故和1起重大事故，其中有5起发生在公路、铁路、地铁工程建设领域，有7起发生在中西部地区，有5起发生在施工风险较大的地下工程。\\n\\n（五）复杂地质条件下施工重大事故风险较高。部分复杂地质地区的隧道工程及地铁工程施工安全风险较高，上半年的广东佛山“2·7”地铁坍塌重大事故发生在深厚富水粉砂层且临近强透水的中粗砂层，隧道透水涌砂涌泥坍塌的风险高。此外，2017年的建筑业1起隧道瓦斯爆炸重大事故和2起各被困9人的隧道坍塌重大涉险事故，也均发生在不良地质和特殊岩土地质隧道施工过程中。\\n\\n（六）企业主体责任不落实仍是事故发生的主要原因。部分施工单位安全生产红线意识不牢，存在侥幸心理，大部分的事故中施工单位总承包、专业承包、劳务分包关系界限不清、职责不明，现场管理混乱，以包代管、包而不管，安全技术交底和培训教育流于形式，不按专项方案施工，施工现场违规违章行为普遍，直接导致事故发生；建设、监理等单位未严格对工程项目进行监督管理，对施工现场安全隐患督促整改不力。\\n\\n二、下一步工作要求\\n\\n当前，全国建筑业规模庞大，在建工程数量持续保持在高位，且目前正值汛期和施工旺季，各地区、各有关部门和中央企业要清醒认识建筑业安全生产面临的严峻形势，进一步筑牢安全红线意识，全面加强建筑业安全生产工作。\\n\\n（一）严格落实企业安全生产主体责任。各地区、各有关部门要定期组织责任制落实情况专项执法检查，推动企业建立健全全员安全生产责任制。要督促施工单位加强对分包和劳务队伍的入场审核和管理，对危险性较大的作业，全过程带班监督管理。要督促建设单位保证安全生产投入，不得对勘察、设计、施工、监理等单位提出不符合法律法规和强制性标准规定的要求，不得压缩合同约定的工期。勘察、设计单位必须在勘察设计文件中提出预防事故的措施建议。监理单位必须严格实施安全监理，按规定对关键工序专项巡视检查和旁站。\\n\\n（二）切实加强施工现场安全管理。各有关单位要针对施工现场风险类型，加强安全管理，针对高处坠落事故风险，要对相应区域的临边、洞口、攀登、悬空和交叉作业部位等进行防护。针对基坑工程、脚手架、起重机械等坍塌事故风险，要严格落实危险性较大的工程施工安全管理规定，必须规范编制施工方案、制定有针对性的安全技术措施，进行书面安全技术交底，施工时由专人负责监控，并加强安全检查，发现问题和隐患必须及时处理和整改。\\n\\n（三）强化复杂地质条件下施工安全风险管控。各有关单位要加强复杂地质条件下风险因素识别及控制方案等方面的工作，编制地质风险因素控制方案及专项施工方案，并按规定进行论证审查后组织实施。隧道施工必须严格超前地质预报，地质条件发生重大变化时，必须重新评估确认。软弱破碎富水、岩溶发育等易发生突水突泥隧道施工，必须提前探明周边地质情况，并相应采取加固、堵排水等措施。有限空间内施工作业必须做到“先通风、再检测、后作业”,并控制火源。高瓦斯、瓦斯突出隧道内必须采用防爆设备。\\n\\n（四）深化建筑施工安全专项治理行动。各地区、各有关部门要根据专项治理实施方案，组织专门力量，集中开展专项治理，严查施工现场违法违规行为和事故隐患。要强化过程督导，各省（区、市）要每半年开展一次、各地（市）要每季度开展一次建筑施工安全专项治理行动督查检查。要结合专项治理工作方案，细化监督检查计划和施工现场检查内容，对安全风险较高的重点工程项目在专项治理工作阶段内要实现检查“全覆盖”。\\n\\n（五）加强安全监管执法和事故调查处理力度。在检查执法中，对发现的问题，要严格依法依规采取现场处理、责令整改、行政处罚、行政强制等措施，切实做到“检查必执法、执法必严格”。要认真组织事故调查处理，查清事故原因，严格对事故责任企业和人员资质资格的处罚。对发生较大及以上生产安全责任事故，瞒报、谎报、迟报生产安全事故等失信行为的，严格按规定将负有责任的建设、施工、监理等单位和有关人员纳入安全生产领域失信联合惩戒“黑名单”，实施有效惩戒。\\n\\n（六）扎实做好当前汛期安全生产工作。各地区、各有关部门要立即督促有关企业排查汛期建设工程安全生产情况，特别是工程项目营地要科学选址，合理布局，与作业区分开设置，保持安全距离。对易发生灾情的工程和营地等，要开展危险源辨识与风险评估，建立风险台账,强化日常巡查，动态监控隐患变化，对于检查出的隐患和问题要指定专人负责督办，限期整改，确保尽快治理。组织开展有针对性的应急演练，做好装备、物资、队伍等各项应急准备工作。要加强汛期值班值守，严格执行领导干部到岗带班和关键岗位24小时值班制度，发现险情要立即将所有人员疏散转移到安全地带，切实保证施工人员生命安全和社会稳定。\\n\\n  国务院安委会办公室\\n\\n     2018年7月19日', '2020-07-16 11:22:27.793453', 0),
	(3, '3333', '/imageStore/94b95546-24f9-4c70-b94e-91b0df242ed2.png', 2, '33333', '2020-07-16 11:30:28.858569', 0);
/*!40000 ALTER TABLE `news` ENABLE KEYS */;

-- 导出  表 offical_website.team 结构
DROP TABLE IF EXISTS `team`;
CREATE TABLE IF NOT EXISTS `team` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `img` longtext DEFAULT NULL,
  `remark` longtext DEFAULT NULL,
  `createTime` datetime(6) DEFAULT current_timestamp(6),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.team 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
REPLACE INTO `team` (`Id`, `img`, `remark`, `createTime`, `isDeleted`) VALUES
	(1, '/imageStore/ffee6e13-bdad-46e3-9496-9d1dc0ba1240.jpg', '参加第七届中国（上海）国际技术进出口交易会', '2020-07-16 13:19:14.528996', 0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;

-- 导出  表 offical_website.user 结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` longtext DEFAULT NULL,
  `password` longtext DEFAULT NULL,
  `isAction` tinyint(1) NOT NULL,
  `createTime` datetime(6) DEFAULT current_timestamp(6),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  offical_website.user 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
REPLACE INTO `user` (`Id`, `loginName`, `password`, `isAction`, `createTime`, `isDeleted`) VALUES
	(1, '111', '698d51a19d8a121ce581499d7b701668', 1, '2020-07-08 13:31:45.000000', 0),
	(7, '222', 'd41d8cd98f00b204e9800998ecf8427e', 0, '2020-07-15 10:35:47.128582', 0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
