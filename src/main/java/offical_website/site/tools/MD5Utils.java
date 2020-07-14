package offical_website.site.tools;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5通用类
 *
 * @author 浩令天下
 * @version 1.0.0_1
 * @since 2017.04.15
 */
public class MD5Utils {
    /**
     * MD5方法
     *
     * @param text 明文
     * @return 密文
     * @throws ApiException
     */
    public static String md5(String text) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(text);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param key  密钥
     * @param md5  密文
     * @return true/false
     * @throws ApiException
     */
    public static boolean verify(String text, String md5) {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if (md5Text.equalsIgnoreCase(md5)) {
            System.out.println("MD5验证通过");
            return true;
        }

        return false;
    }
}