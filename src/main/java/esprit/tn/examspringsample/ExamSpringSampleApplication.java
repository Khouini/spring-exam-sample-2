package esprit.tn.examspringsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamSpringSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamSpringSampleApplication.class, args);
    }

}
