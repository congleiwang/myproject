package wang.conglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: myproject
 * @description: 错误处理
 * @author: conglei.Wang
 * @create: 2018-07-23 23:44
 **/
@Controller
@RequestMapping("errorHandler")
public class ErrorHandler {

    @RequestMapping(produces = "text/html")
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @RequestMapping
    @ResponseBody
    public Map<String, Object> error(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>(4);

        result.put("path", request.getRequestURI());
        return result;
    }
}
