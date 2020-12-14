package cn.lhcz.name;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.lhcz")
@MapperScan(value = "cn.lhcz.name.project.mapper")
public class NameApplication {

    public static void main(String[] args) {
        SpringApplication.run(NameApplication.class, args);
    }
}
