package wang.conglei.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: myproject
 * @description: 全局异常处理
 * @author: conglei.Wang
 * @create: 2018-07-23 23:20
 **/

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    private Map<String, Object> handleException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>(4);

        result.put("status", response.getStatus());
        result.put("exception", ex.getClass());
        result.put("message", ex.getMessage());
        result.put("path", request.getRequestURI());
        return result;

    }

}
