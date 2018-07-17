package wang.conglei.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: springTest
 * @description: 修改参数值后的request
 * @author: conglei.Wang
 * @create: 2018-07-07 20:01
 **/
public class ParameterHttpServletRequest extends HttpServletRequestWrapper {

    private Map<String,String[]> paramsMap;

    public ParameterHttpServletRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        String[] values = paramsMap.get(name);
        if (values == null || values.length == 0) {
            return null;
        }
        return values[0];
    }

    @Override
    public String[] getParameterValues(String name) {
        return paramsMap.get(name);
    }
    @Override
    public Map<String, String[]> getParameterMap() {
        return paramsMap;
    }

    @Override
    public Enumeration<String> getParameterNames() {
        return new Enumeration<String>() {
            private Iterator<String> iterator = paramsMap.keySet().iterator();

            @Override
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }

            @Override
            public String nextElement() {
                return iterator.next();
            }
        };
    }
}