package uk.co.inps.Controllers;

import org.springframework.web.bind.annotation.*;
import uk.co.inps.Utils.Constants;

/**
 * Created by connor.nicol on 17/08/2017.
 */
@RestController
public class HelloWorldController
{
    @RequestMapping(value = Constants.HELLO_NAME_INLINE)
    @ResponseBody
    private String helloPathVariable(@PathVariable final String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(value = Constants.HELLO_NAME_PARAM)
    @ResponseBody
    private String helloRequestParameter(@RequestParam final String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(value = Constants.HELLO_WORLD_URL)
    @ResponseBody
    private String helloWorld() {
        return "Hello world!";
    }
}
