package youngHan.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        // 기존에 작성된 AppConfig 나 TestConfig 를 사용하지 않게끔 하기 위해 추가하였음
)
public class AutoAppConfig {
}
