package EventsProject.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

public interface WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry);
}
