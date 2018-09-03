package cn.exrick.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    // 设置跨域访问
    /*
    * addMapping：可以被跨域的路径，”/**”表示无限制。
    * allowedMethods：允许跨域访问资源服务器的请求方式，如：POST、GET、PUT、DELETE等，“*”表示无限制。
    * allowedOrigins：”*”允许所有的请求域名访问跨域资源，当设置具体URL时只有被设置的url可以跨域访问。
    * \例如：allowedOrigins(“https://www.baidu.com”),则只有https://www.baidu.com能访问跨域资源。
    * */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }
}