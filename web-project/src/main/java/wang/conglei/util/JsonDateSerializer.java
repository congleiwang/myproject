package wang.conglei.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.time.FastDateFormat;

import java.io.IOException;
import java.util.Date;

/**
 * @program: springTest
 * @description: json序列化
 * @author: conglei.Wang
 * @create: 2018-07-17 23:20
 **/
public class JsonDateSerializer extends JsonSerializer<Date> {
    private static final String FORMAT_DATE = "yyyy-MM-dd";
    private static final String FORMAT_TIMESTAMP = "yyyy-MM-dd HH:mm:ss";

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        if (value != null) {
            String dateFormat = value instanceof java.sql.Date ? "yyyy-MM-dd" : "yyyy-MM-dd HH:mm:ss";
            FastDateFormat fastDateFormat = FastDateFormat.getInstance(dateFormat);
            gen.writeString(fastDateFormat.format(value));
        }
    }
}
