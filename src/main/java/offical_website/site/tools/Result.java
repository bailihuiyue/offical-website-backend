package offical_website.site.tools;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private static final String SUCCESS = "000000";
    private static final String NO_AUTH = "000001";
    private static final String WRONG_PARAMETER = "000002";
    private static final String CONTRACT_NOT_EXIST = "000003";
    private static final String FAILED = "999999";

    private String resultCode;
    private String resultMsg;
    private T data;

    public static <T> Result<T> success(T data) {
        return new Result(SUCCESS, null, data);
    }

    public static Result<String> failed(String resultMsg) {
        return new Result(FAILED, resultMsg, null);
    }

    public static Result<String> errorMsg(String code, String errMsg) {
        return new Result(code, errMsg, null);
    }
}
