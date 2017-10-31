import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OurInterface ourClass() {

        OurClass ourClass = new OurClass("hello from Constructor");
        ourClass.setShalom("shalom from Setter");
        return ourClass;
    }
}
