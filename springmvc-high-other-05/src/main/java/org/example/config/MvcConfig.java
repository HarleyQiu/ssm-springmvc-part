package org.example.config;

import org.example.interceptor.MyInterceptor;
import org.example.interceptor.MyInterceptor1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@ComponentScan("org.example")
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    //开启静态资源查找
    // dispatcherServlet -> handlerMapping找有没有对应的handler -》【 没有 -》 找有没有静态资源 】
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 1. 拦截全部请求
        // registry.addInterceptor(new MyInterceptor());

        // 2. 指定地址拦截 .addPathPatterns("/user/data");
        // *  任意一层字符串   ** 任意多层字符串
        // registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**");

        // 3. 排除拦截 排除的地址应该在拦截地址内部
        // registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/data1");

        registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new MyInterceptor1());
    }
}
