# offical-website-backend
 offical-website-vue的后端代码

初学java,使用了spring boot框架

项目包含了token验证,图片上传,表增删改查三个主要功能

1.项目启动之后将scr/main/java/offical_website.site/config/MyConfiguration的如下代码中的
'file:D:/gitBackup/offical-website-backend/imageStore/'改为项目中imageStore文件夹的绝对路径或者存储路径的绝对路径
registry.addResourceHandler("/imageStore/**").addResourceLocations("file:D:/gitBackup/offical-website-backend/imageStore/");

2.数据库文件:offical-website-backend\src\main\java\offical_website\site\sql