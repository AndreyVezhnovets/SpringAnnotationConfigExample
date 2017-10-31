import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        We use Java class (AppConfig) for initialization spring context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        we can get our object by beanId;
//        OurClass ourClass = (OurClass) applicationContext.getBean("OurClassId");
//        but it is better do it by interface
        OurClass ourClass = (OurClass) applicationContext.getBean(OurInterface.class);
        ourClass.helloSpring();
        ourClass.shalomSpring();
    }
}
