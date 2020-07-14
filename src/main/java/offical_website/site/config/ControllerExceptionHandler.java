package offical_website.site.config;


import offical_website.site.tools.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ApiException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public Object handleBusinessException(Exception e) {
        return e.getMessage();
    }
}
