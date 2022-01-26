package tech.codefinity.application

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    static String home() {
        return "Hello, World!"
    }

}