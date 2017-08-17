package uk.co.inps.spike.Controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by connor.nicol on 17/08/2017.
 */
@RestController
public class HelloWorldController
{
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
}
