package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dependencyInjection")
//@ComponentScan({"com.dependencyInjection","AnnotationBaseConfig"})
public class JavaConfig {

}
