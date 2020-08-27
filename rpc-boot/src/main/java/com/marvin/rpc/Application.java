package com.marvin.rpc;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 *
 * @author wuyujian
 * @date 2020-08-27
 */
@SpringBootApplication(scanBasePackages = "com.marvin.rpc")
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.LOG)
                .sources(Application.class)
                .run(args);
    }
}
