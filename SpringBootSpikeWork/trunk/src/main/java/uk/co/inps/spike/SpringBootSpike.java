package uk.co.inps.spike;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Hello world!
 */
@Controller
@EnableAutoConfiguration
public class SpringBootSpike {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    private String helloPathVariable(@PathVariable final String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    private String helloRequestParameter(@RequestParam final String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping("/")
    @ResponseBody
    private String helloWorld() {
        return "Hello world!";
    }

    public static void main(final String[] args) {
        SpringApplication.run(SpringBootSpike.class, args);
    }
}
