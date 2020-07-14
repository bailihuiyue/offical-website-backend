package offical_website.site.tools;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.*;

/**
 * @author zm
 * @desc 使用token验证用户是否登录
 **/
public class TokenUtils {
    //设置过期时间
    private static final long EXPIRE_DATE = 2 * 60 * 100000;
    //token秘钥
    private static final String TOKEN_SECRET = "ZCfasfhuaUUHufguGuwu2020BQWE";

    public static String token(String username, String password) {

        String token = "";
        //过期时间
        Date date = new Date(System.currentTimeMillis() + EXPIRE_DATE);
        //秘钥及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头部信息
        Map<String, Object> header = new HashMap<>();
        header.put("typ", "JWT");
        header.put("alg", "HS256");
        //携带username，password信息，生成签名
        token = JWT.create()
                .withHeader(header)
                .withClaim("username", username)
                .withClaim("password", password).withExpiresAt(date)
                .sign(algorithm);
        return token;
    }

    public static boolean verify(String token) {
        /**
         * @desc 验证token，通过返回true
         * @params [token]需要校验的串
         **/
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT jwt = verifier.verify(token);
        return true;
    }

    public static void setToken(String token) {

    }
//    public static void main(String[] args) {
//        String username ="zhangsan";
//        String password = "123";
//        String token = token(username,password);
//        System.out.println(token);
//        boolean b = verify("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwYXNzd22yZCI6IjEyMyIsImV4cCI6MTU3ODE5NzQxMywidXNlcm5hbWUiOiJ6aGFuZ3NhbiJ9.IyTZT0tISQQZhGhsNuaqHGV8LD7idjUYjn3MGbulmJg");
//        System.out.println(b);
//    }
}