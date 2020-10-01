package ir.fqxcloud.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudApplication.class, args);
    }

    @GetMapping("/")
    public String test(){
        return "Working...";
    }

}
