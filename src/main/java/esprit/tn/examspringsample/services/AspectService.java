package esprit.tn.examspringsample.services;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {
    private static final Logger log = LoggerFactory.getLogger(AspectService.class);

    //@After("getMethods()")
    @After("execution(* esprit.tn.examspringsample.services..get*(..))")
    public void afterGet() {
        log.info("Hello");
    }
}
