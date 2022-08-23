import lxs.spring.test.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lxs.spring.test")
public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.hello();
	}
}
