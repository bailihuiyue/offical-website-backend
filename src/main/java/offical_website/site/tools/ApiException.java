package offical_website.site.tools;

import com.alibaba.fastjson.JSONObject;

public class ApiException extends RuntimeException {

    public ApiException(String s) {
        super(s);
    }

    public static void invalidToken(String token) throws Exception {
        String msg = "{\"resultMsg\":\"token异常,请重新登陆!\"}";
        try {
            if (!TokenUtils.verify(token)) {
                throw new ApiException(msg);
            }
        } catch (Exception e) {
            throw new ApiException(msg);
        }

    }

    public static Exception handleException(String errMsg) throws Exception {
        throw new ApiException("{\"resultMsg\":\"" + errMsg + "\"}");
    }
}