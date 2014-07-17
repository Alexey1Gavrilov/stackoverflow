package stackoverflow.mixin.b;

import org.codehaus.jackson.map.ObjectMapper;
import stackoverflow.mixin.a.MixIn;

import javax.servlet.http.Cookie;
import java.io.IOException;

public class JacksonMixin {
    public static final String JSON = "{\"name\":\"abc\",\"value\":\"xyz\"}";


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.getDeserializationConfig().addMixInAnnotations(Cookie.class, MixIn.class);
        Cookie cookie = mapper.readValue(JSON, Cookie.class);
        System.out.println(cookie.getName() + " " + cookie.getValue());
    }
}