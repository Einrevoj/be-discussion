package jcano.bediscussion.controller;

import jcano.bediscussion.model.HelloWorldModel;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @GetMapping("")
    public String getHelloWorld() {
        return "Hello World";
    }

    @PutMapping("/add")
    public String addHelloWorld(@RequestBody HelloWorldModel helloWorldModel) {
        return "Hello " .concat(helloWorldModel.getFirstName()).concat("").concat(helloWorldModel.getLastName());
    }

    @PostMapping("/{firstName}")
    public String editHelloWorld(@PathVariable String firstName) {
        return "Hi! nice to see you ".concat(firstName);
    }

}
