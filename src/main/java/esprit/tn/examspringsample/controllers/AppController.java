package esprit.tn.examspringsample.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import esprit.tn.examspringsample.services.IAppService;

@RestController
@AllArgsConstructor
@RequestMapping("restApp")
public class AppController {
    final private IAppService appService;

    @GetMapping("test")
    public String test() {
        return appService.test();
    }
}
