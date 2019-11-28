package cn.ts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("cn.ts.mapper")
@SpringBootApplication
@EnableScheduling
@Configuration
public class VueApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueApiApplication.class, args);
    }

}
