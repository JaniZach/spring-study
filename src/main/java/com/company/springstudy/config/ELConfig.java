package com.company.springstudy.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author P50
 * @date 2018/4/1 17:27
 */
@Configuration
@ComponentScan(value = "com.company.springstudy")
@PropertySource(value = {"classpath:test.properties",
        "classpath:application.properties",
        "classpath:application-dev.properties"})
public class ELConfig {

    /** 普通字符串注入 */
    @Value("字符串注入")
    private String str;

    /** 获取操作系统名称 */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /** 注入表达式结果 */
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomDouble;

    /** 注入其他Bean的属性 */
    @Value("#{myBook.name}")
    private String fromAnother;

    /** 注入配置文件 */
    @Value("${spring.profiles.active}")
    private String activeProfile;

    /** 注入本地文件 */
    @Value("classpath:test.properties")
    private Resource testFile;

    /** 注入配置文件 */
    @Autowired
    private Environment environment;

    /** 注入网址 */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() throws Exception{
        System.out.println("注入字符串："+str);
        System.out.println("注入系统名称："+osName);
        System.out.println("注入EL表达式："+randomDouble);
        System.out.println("注入其他Bean属性："+fromAnother);
        System.out.println("注入配置文件："+activeProfile);
        System.out.println("注入本地文件："+IOUtils.toString(testFile.getInputStream()));
        System.out.println("注入配置文件environment："+environment.getProperty("logging.path"));
        System.out.println("注入网址："+IOUtils.toString(testUrl.getInputStream()));
    }

}