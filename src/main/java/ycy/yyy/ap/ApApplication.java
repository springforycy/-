package ycy.yyy.ap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "ycy.yyy.ap.dao")
public class ApApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApApplication.class, args);
    }

}
