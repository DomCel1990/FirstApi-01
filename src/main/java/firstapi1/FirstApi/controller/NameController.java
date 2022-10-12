package firstapi1.FirstApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @GetMapping
    public String getRequest() {
        return "Domenico";
    }

    @PostMapping
    public StringBuilder postRequest() {
        StringBuilder str = new StringBuilder(getRequest());
        StringBuilder srtReverse = str.reverse();
        return srtReverse;
    }

}
