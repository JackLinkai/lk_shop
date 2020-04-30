# lk_shop
SSM框架写的商城资源，使用eclipse编写，持续更新中
lk_shop介绍
一、环境
	JDK：8
	Tomcat：8.5
	MySQL：5.7
	使用eclipse开发工具
二、项目技术
	1.后端技术使用SSM框架（Spring、SpringMVC、MyBatis）
	2.前端UI使用echarts、zTree、datatable等js框架
三、项目结构
	数据库后台：
		商品相关表设计:
			商品分类表(product_category)：
				id		商品分类Id
				parent_id		商品分类父Id
				name		商品分类名称
				type_id		商品分类类型Id
				create_time	商品分类创建时间
				update_time	商品分类修改时间
				brand		品牌表(brand)
				id		品牌ID
				name		品牌名称
				first_char		品牌首字母
				logo_img		品牌logo
				create_time	创建时间
				update_time	修改时间
				status		状态
				desc		描述
			SPU商品表
				1.商品主表(product)
					product_id 			商品id
					product_name 			商品名称
					default_sku_id 			默认SKU
					audit_status 			状态
					is_marketable 			是否上架
					brand_id 				品牌
					caption 				副标题
					category1_id 			一级类目
					category2_id 			二级类目
					category3_id 			三级类目
					big_pic				大图
					mid_pic				中图
					small_pic 				小图
					sale_price				销售价(保护价)
					list_price 				商城价
					type_template_id 			分类模板ID
					is_enable_spec 			是否启用规格
					is_delete 				是否删除
					create_time			商品创建时间
					update_time			商品修改时间
				2.商品描述(product_desc)
					product_id 			商品id
					introduction 			描述
					specification_items 			规格结果集，所有规格，包含isSelected
					custom_attribute_items 		自定义属性（参数结果）
					product_images  			商品图片列表
					package_list 			包装列表
					sale_service 			售后服务
			SKU(最小库存单位)商品表
				sku_id 		商品id，同时也是商品编号
				title 		商品标题
				sell_point 		商品卖点
				price 		商品价格，单位为：元
				stock_count 	库存数量
				barcode 		商品条形码
				image 		商品图片
				categoryId 	所属类目，叶子类目
				status 		商品状态，1-正常，2-下架，3-删除
				create_time 	创建时间
				update_time 	更新时间 
				cost_pirce 	折扣价
				market_price	市场价
				is_default  	是否为默认sku
				product_id 	商品
				category 		商品所属最小分类(商品分类3级)
				brand 		品牌
				spec 		规格属性(例如:手机 "屏幕尺寸","内存","颜色"...)
		内容相关表设计:
			广告管理
				广告分类(ad_categroy)
					id			广告分类ID
					name			广告分类名称
					create_time		广告分类创建时间
					update_time		广告分类更新时间
					sort			广告分类排序
				广告内容(ad_content)
					id			广告ID
					title			广告标题
					categoryId1		广告所属一级分类ID
					categoryId2		广告所属二级分类ID
					categoryId3		广告所属三级分类ID
					sort			广告排序序号
					img			广告图片
					img_size			广告图片尺寸
					url			广告链接
					create_time		广告创建时间
					update_time		广告更新时间
					status			广告状态
			用户相关表设计
				用户表(user)
				id 			用户ID
				username 			用户名
				password 			密码
				phone 			手机号
				email		 	邮箱
				create_time 		创建时间
				update_time 		修改时间
				nick_name 		昵称
				name 			真实姓名
				status 			用户使用状态
				head_pic 			头像地址
				qq 			QQ号码
				account_balance 		账户余额
				is_mobile_check 		手机是否验证
				is_email_check 		邮箱是否检测
				sex 			性别
				user_level 			会员等级
				points 			积分
				experience_value 		经验值
				birthday 			生日
				last_login_time 		最后登录时间
	功能模块：
		后台商品管理：商品上架，商品信息维护
		前台商品管理：展示商品
		搜索模块：lucene,solr,elasticSearch,endeca
		内容管理系统：
			广告管理
			消息管理
			文章管理
			用户管理模块：用户注册,用户登录
