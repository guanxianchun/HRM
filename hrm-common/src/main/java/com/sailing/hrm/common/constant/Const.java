package com.sailing.hrm.common.constant;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 常量类；后续增加常量需要按类型枚举
 * 
 * @author sf
 */
public class Const {

	/**
	 * 国际化资源文件
	 */
	public static final ResourceBundle MESSAGE_RESOURCE = ResourceBundle
			.getBundle("message", new Locale("zh", "CN"));

	/**
	 * 统一的异常打印信息
	 */
	public static final String DEBUG_MESSAGE = "====报异常了====";

	/**
	 * 通用常量值 ： 可表示： 成功、是、等
	 */
	public static final String COMM_TYPE_YES = "1";

	/**
	 * 通用常量值 ： 可表示： 失败、否、等
	 */
	public static final String COMM_TYPE_NO = "0";

	/**
	 * Windows操作系统文件路径分隔符
	 */
	public static final String SEPARATOR_WINDOW = "\\";

	/**
	 * Linux/Unix操作系统文件路径分隔符
	 */
	public static final String SEPARATOR_LINUX = "/";

	/**
	 * 系统的中文名称
	 */
	public static final String SYSTEM_NAME_CH = "人力资源管理平台";

	/**
	 * 系统的中文昵称
	 */
	public static final String SYSTEM_NICKNAME_CH = "启航";

	/**
	 * 文件上传指定一级目录
	 */
	public static final String UPLOADFILE_ROOT_PATH = "/upload/";

	/**
	 * 不对匹配该值的访问路径拦截（正则）
	 */
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(register)|(isLogin)|(sess)).*"; // 不对匹配该值的访问路径拦截（正则）

	/**
	 * 用户性别
	 */
	public class Sex {
		/**
		 * 用户性别 -- 男
		 */
		public static final String SEX_MALE = "1";
		/**
		 * 用户性别 -- 女
		 */
		public static final String SEX_FEMALE = "0";
	}

	/**
	 * 是否验证权限 y 或 n',
	 */
	public class IsCheck {
		/**
		 * 是否验证权限 y
		 */
		public static final String CHECK_YES = "y";
		/**
		 * 是否验证权限n
		 */
		public static final String CHECK_NO = "n";
	}

	/**
	 * 用户状态常量
	 */
	public class UserStatus {
		/**
		 * 用户状态常量 --待激活
		 */
		public static final String UNACTIVATE = "0";

		/**
		 * 用户状态常量 -- 在线
		 */
		public static final String ONLINE = "1";

		/**
		 * 用户状态常量 -- 离线
		 */
		public static final String OFFLINE = "2";

		/**
		 * 用户状态常量 --冻结
		 */
		public static final String LOCKED = "3";
	}

	/**
	 * 用户类型
	 */
	public class UserType {

		/**
		 * 用户类型--管理员
		 */
		public static final String TYPE_MANAGER = "0";

		/**
		 * 用户类型--运营人员
		 */
		public static final String TYPE_OPERATION = "1";

		/**
		 * 用户类型--普通用户
		 */
		public static final String TYPE_COMMON_USER = "2";

		/**
		 * 用户类型--c持证用户
		 */
		public static final String TYPE_CSIP_USER = "3";

		/**
		 * 用户类型--企业
		 */
		public static final String TYPE_ENTERPRISE = "4";

		/**
		 * 用户类型--生态圈伙伴
		 */
		public static final String TYPE_ECOSYSTEM_PARTNERS = "5";
	}

	/**
	 * 邮件发送类型常量
	 */
	public class SendMailType {
		/**
		 * 邮件发送类型常量 -- 系统 （cm_maillog.SendType）
		 */
		public static final String TYPE_SENDMAIL_SYS = "system";

		/**
		 * 邮件发送类型常量 -- 手工 （cm_maillog.SendType）
		 */
		public static final String TYPE_SENDMAIL_HAND = "handwork";

		/**
		 * 邮件类型常量 -- 广告邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_AD = "ad";

		/**
		 * 邮件类型常量 -- 激活邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_ACTIVATE = "activate";

		/**
		 * 邮件类型常量 -- 通知邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_NOTICE = "notice";

		/**
		 * 邮件类型常量 -- 系统消息邮件（cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_SYSMESSAGES = "SYSmessages";
	}

	/**
	 * （上传）文件类型常量 cm_fileupload.file_catalog
	 */
	public class FileType {
		/**
		 * （上传）文件类型常量 -- 用户/单位头像
		 */
		public static final String TYPE_AVATARS = "avatars";

		/**
		 * （上传）文件类型常量 -- 证件照片
		 */
		public static final String TYPE_CERTPHOTOS = "certphotos";

		/**
		 * （上传）文件类型常量 -- 身份证扫描件
		 */
		public static final String TYPE_IDCARDS = "idcards";

		/**
		 * （上传）文件类型常量 -- CISP证书扫描件
		 */
		public static final String TYPE_CISPS = "cisps";

		/**
		 * （上传）文件类型常量 -- 个人资料word附件
		 */
		public static final String TYPE_PROFILEDOCS = "profiledocs";

		/**
		 * （上传）文件类型常量 -- 企业和学校LOGO
		 */
		public static final String TYPE_LOGOS = "logos";

		/**
		 * （上传）文件类型常量 -- 课程图片
		 */
		public static final String TYPE_COURSEIAMGES = "courseimages";

		/**
		 * （上传）文件类型常量 -- 讲师照片
		 */
		public static final String TYPE_COURSETEACHERS = "courseteachers";

		/**
		 * （上传）文件类型常量 -- 指导书图片
		 */
		public static final String TYPE_GUIDEIAMGES = "guideimages";

		/**
		 * （上传）文件类型常量 -- 指导书文件
		 */
		public static final String TYPE_GUIDEFILES = "guidefiles";

		/**
		 * （上传）文件类型常量 -- 论坛帖子图片
		 */
		public static final String TYPE_BBSIAMGES = "bbsimages";

		/**
		 * （上传）文件类型常量 -- 内容发布图片
		 */
		public static final String TYPE_CMSCNTIAMGES = "cmscntimages";

		/**
		 * （上传）文件类型常量 -- 企业和学校展板
		 */
		public static final String TYPE_PANELS = "panels";

	}

	// 后续常量尽量按使用类型分类枚举
	/**
	 * （上传）图片类型
	 */
	public class ImageType {

		/**
		 * （上传）文件类型常量 -- 用户/单位头像
		 */
		public static final String TYPE_HEAD = "head";

		/**
		 * （上传）文件类型常量 -- 证件照片
		 */
		public static final String TYPE_CERTPHOTOS = "cert";

		/**
		 * （上传）文件类型常量 -- 身份证扫描件
		 */
		public static final String TYPE_IDCARDS = "idcard";

		/**
		 * （上传）文件类型常量 -- CISP证书扫描件
		 */
		public static final String TYPE_CISPS = "cisp";

		/**
		 * 上传）文件类型常量 -- 企业LOGO
		 */
		public static final String TYPE_LOGO = "logo";
	}

	/**
	 * 上传文件的命名规则
	 */
	public class NameRule {

		/**
		 * 根据UserNo命名，一般是唯一的
		 */
		public static final String BYUSERNO = "byuserno";

		/**
		 * 根据时间命名，如yyyyMMddHHmmss
		 */
		public static final String BYTIME = "bytime";

		/**
		 * 根据日期命名，如yyyyMMdd
		 */
		public static final String BYDATE = "bydate";

		/**
		 * 根据随机数UUID命名
		 */
		public static final String BYRANDOM = "byrandom";
	}

	/**
	 * 审核状态（线上课程审核）
	 */
	public class AuditStatus {
		/**
		 * 审核状态 : 未审核
		 */
		public static final String NOAUDIT = "noaudit";
		/**
		 * 审核状态 : 通过
		 */
		public static final String APPROVE = "approve";

		/**
		 * 审核状态 : 不通过
		 */
		public static final String UNAPPROVE = "unapprove";
	}

	/**
	 * 密码最大长度、最短长度判断
	 * 
	 * @author zhang_zqiang
	 * @date 2014年11月17日
	 * @version V1.0
	 */
	public class PasswordLength {
		/**
		 * 密码最短长度 zhang_zqiang
		 */
		public static final int PWD_MINLENGTH = 6;

		/**
		 * 密码最大长度 zhang_zqiang
		 */
		public static final int PWD_MAXLENGTH = 16;

		public static final int PWD_SPACE_NO = 0;
	}

	/**
	 * 操作日志操作状态
	 * 
	 * @author xpk
	 * @date 2014年11月19日
	 * @version V1.0
	 */
	public class OperLogStatus {

		/**
		 * 操作成功
		 */
		public static final String SUCCESS = "1";

		/**
		 * 操作失败
		 */
		public static final String FAILURE = "0";

		/**
		 * 系统异常
		 */
		public static final String EXCEPTION = "2";

		/**
		 * 事务回滚
		 */
		public static final String ROLLBAK = "3";
	}

	/**
	 * 线上课程状态
	 */
	public class CourseStatus {

		/**
		 * 未审核
		 */
		public static final short UNCHECK = 0;

		/**
		 * 审核中
		 */
		public static final short CHECKING = 1;

		/**
		 * 审核成功
		 */
		public static final short CHECK_SUCCESS = 2;

		/**
		 * 审核失败
		 */
		public static final short CHECK_FAILURE = 3;

		/**
		 * 已下架
		 */
		public static final short OFF = 4;
	}

	/***
	 * 字典表字典用户状态id
	 * 
	 * @author zhang_zqiang
	 * @date 2014年12月18日
	 * @version V1.0
	 */
	public class DictionaryStatus {

		/**
		 * 字典表类型、用户状态id
		 */
		public static final String DICUSERTYPE = "2";
	}

	/***
	 * 登录提示邮箱后缀
	 * 
	 * @author zhang_zqiang
	 * @date 2014年12月23日
	 * @version V1.0
	 */
	public static class LoginHiniEmail {
		public static final String[] EMAIL = { "@cecgw.cn", "@qq.com",
				"@126.com", "@163.com", "@139.com", "@sina.com", "@sohu.com",
				"@gmail.com" };
	}
	
	/***
	 * 登录、注册、忘记密码验证码汉字字符集
	 * @author guanxianchun
	 * @version 1.0
	 */
	public static class LoginForgetPassCode{
		public static final	String CODES = "\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765"
				+ "\u4ed6\u8fd9\u4e0a\u7740\u4e2a\u5730\u5230\u5927\u91cc\u8bf4\u5c31\u53bb\u5b50\u5f97\u4e5f"
				+ "\u548c\u90a3\u8981\u4e0b\u770b\u5929\u65f6\u8fc7\u51fa\u5c0f\u4e48\u8d77\u4f60\u90fd\u628a"
				+ "\u597d\u8fd8\u591a\u6ca1\u4e3a\u53c8\u53ef\u5bb6\u5b66\u53ea\u4ee5\u4e3b\u4f1a\u6837\u5e74"
				+ "\u60f3\u751f\u540c\u8001\u4e2d\u5341\u4ece\u81ea\u9762\u524d\u5934\u9053\u5b83\u540e\u7136"
				+ "\u8d70\u5f88\u50cf\u89c1\u4e24\u7528\u5979\u56fd\u52a8\u8fdb\u6210\u56de\u4ec0\u8fb9\u4f5c"
				+ "\u5bf9\u5f00\u800c\u5df1\u4e9b\u73b0\u5c71\u6c11\u5019\u7ecf\u53d1\u5de5\u5411\u4e8b\u547d"
				+ "\u7ed9\u957f\u6c34\u51e0\u4e49\u4e09\u58f0\u4e8e\u9ad8\u624b\u77e5\u7406\u773c\u5fd7\u70b9"
				+ "\u5fc3\u6218\u4e8c\u95ee\u4f46\u8eab\u65b9\u5b9e\u5403\u505a\u53eb\u5f53\u4f4f\u542c\u9769"
				+ "\u6253\u5462\u771f\u5168\u624d\u56db\u5df2\u6240\u654c\u4e4b\u6700\u5149\u4ea7\u60c5\u8def"
				+ "\u5206\u603b\u6761\u767d\u8bdd\u4e1c\u5e2d\u6b21\u4eb2\u5982\u88ab\u82b1\u53e3\u653e\u513f"
				+ "\u5e38\u6c14\u4e94\u7b2c\u4f7f\u5199\u519b\u5427\u6587\u8fd0\u518d\u679c\u600e\u5b9a\u8bb8"
				+ "\u5feb\u660e\u884c\u56e0\u522b\u98de\u5916\u6811\u7269\u6d3b\u90e8\u95e8\u65e0\u5f80\u8239"
				+ "\u671b\u65b0\u5e26\u961f\u5148\u529b\u5b8c\u5374\u7ad9\u4ee3\u5458\u673a\u66f4\u4e5d\u60a8"
				+ "\u6bcf\u98ce\u7ea7\u8ddf\u7b11\u554a\u5b69\u4e07\u5c11\u76f4\u610f\u591c\u6bd4\u9636\u8fde"
				+ "\u8f66\u91cd\u4fbf\u6597\u9a6c\u54ea\u5316\u592a\u6307\u53d8\u793e\u4f3c\u58eb\u8005\u5e72"
				+ "\u77f3\u6ee1\u65e5\u51b3\u767e\u539f\u62ff\u7fa4\u7a76\u5404\u516d\u672c\u601d\u89e3\u7acb"
				+ "\u6cb3\u6751\u516b\u96be\u65e9\u8bba\u5417\u6839\u5171\u8ba9\u76f8\u7814\u4eca\u5176\u4e66"
				+ "\u5750\u63a5\u5e94\u5173\u4fe1\u89c9\u6b65\u53cd\u5904\u8bb0\u5c06\u5343\u627e\u4e89\u9886"
				+ "\u6216\u5e08\u7ed3\u5757\u8dd1\u8c01\u8349\u8d8a\u5b57\u52a0\u811a\u7d27\u7231\u7b49\u4e60"
				+ "\u9635\u6015\u6708\u9752\u534a\u706b\u6cd5\u9898\u5efa\u8d76\u4f4d\u5531\u6d77\u4e03\u5973"
				+ "\u4efb\u4ef6\u611f\u51c6\u5f20\u56e2\u5c4b\u79bb\u8272\u8138\u7247\u79d1\u5012\u775b\u5229"
				+ "\u4e16\u521a\u4e14\u7531\u9001\u5207\u661f\u5bfc\u665a\u8868\u591f\u6574\u8ba4\u54cd\u96ea"
				+ "\u6d41\u672a\u573a\u8be5\u5e76\u5e95\u6df1\u523b\u5e73\u4f1f\u5fd9\u63d0\u786e\u8fd1\u4eae"
				+ "\u8f7b\u8bb2\u519c\u53e4\u9ed1\u544a\u754c\u62c9\u540d\u5440\u571f\u6e05\u9633\u7167\u529e"
				+ "\u53f2\u6539\u5386\u8f6c\u753b\u9020\u5634\u6b64\u6cbb\u5317\u5fc5\u670d\u96e8\u7a7f\u5185"
				+ "\u8bc6\u9a8c\u4f20\u4e1a\u83dc\u722c\u7761\u5174\u5f62\u91cf\u54b1\u89c2\u82e6\u4f53\u4f17"
				+ "\u901a\u51b2\u5408\u7834\u53cb\u5ea6\u672f\u996d\u516c\u65c1\u623f\u6781\u5357\u67aa\u8bfb"
				+ "\u6c99\u5c81\u7ebf\u91ce\u575a\u7a7a\u6536\u7b97\u81f3\u653f\u57ce\u52b3\u843d\u94b1\u7279"
				+ "\u56f4\u5f1f\u80dc\u6559\u70ed\u5c55\u5305\u6b4c\u7c7b\u6e10\u5f3a\u6570\u4e61\u547c\u6027"
				+ "\u97f3\u7b54\u54e5\u9645\u65e7\u795e\u5ea7\u7ae0\u5e2e\u5566\u53d7\u7cfb\u4ee4\u8df3\u975e"
				+ "\u4f55\u725b\u53d6\u5165\u5cb8\u6562\u6389\u5ffd\u79cd\u88c5\u9876\u6025\u6797\u505c\u606f"
				+ "\u53e5\u533a\u8863\u822c\u62a5\u53f6\u538b\u6162\u53d4\u80cc\u7ec6";
	}
	 
}
