package site.cogirihub.api.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.cogirihub.api.domain.Messenger;

@RestController
public class HomeController {

    @GetMapping("/")
    public Messenger home() {
        return new Messenger(200, "Hello World");
    }
}

