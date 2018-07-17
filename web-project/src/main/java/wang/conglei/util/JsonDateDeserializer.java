package wang.conglei.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @program: springTest
 * @description: json反序列
 * @author: conglei.Wang
 * @create: 2018-07-17 23:04
 **/
public class JsonDateDeserializer extends JsonDeserializer<Date> {

    private static final String[] FORMAT_DATE = new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd", "yyyy-MM", "", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSS"};


    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String text = p.getText().trim();
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        try {
            if (text.endsWith("Z")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat.parse(text);
            }
            return DateUtils.parseDate(text, FORMAT_DATE);
        } catch (ParseException var5) {
            return new Date(Long.parseLong(text));
        }
    }

}
