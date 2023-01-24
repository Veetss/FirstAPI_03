package it.develhope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("/concat")
    public String concatStrings(@RequestParam("first") String first,
                                     @RequestParam(value = "second", required = false) String second) {
        if (second == null) {
            return first;
        }
        return "This is your concat parameter: " + first + " " + second;
    }
}