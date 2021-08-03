package com.example.worksopdip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/id")
    public IDResponse idResponse() {
        return new IDResponse("AA");
    }
}
