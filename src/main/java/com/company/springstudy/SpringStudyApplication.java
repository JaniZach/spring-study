package com.company.springstudy;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author P50
 * @date 2018/3/31 15:01
 *
 * spring boot 配置类
 */
@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringStudyApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}
}
