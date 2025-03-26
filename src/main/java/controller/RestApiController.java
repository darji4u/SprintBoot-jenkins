package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @RequestMapping(method = RequestMethod.GET, value = "/userData")
    public String getUserData(){
        return "Naresh Darji";
    }

}
