# offical-website-backend
 offical-website-vue的后端代码

1.登陸
2.md5加密
3.獲取用戶列表
4.报错提示(用户不存在等...)
5.token
6.跨域


项目启动之后将scr/main/java/offical_website.site/config/MyConfiguration的如下代码中的
file:D:/gitBackup/offical-website-backend/imageStore/改为项目中imageStore文件夹的绝对路径
registry.addResourceHandler("/imageStore/**").addResourceLocations("file:D:/gitBackup/offical-website-backend/imageStore/");