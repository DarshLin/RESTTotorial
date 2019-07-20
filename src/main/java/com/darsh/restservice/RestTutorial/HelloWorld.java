package com.darsh.restservice.RestTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.Text;

@RestController
public class HelloWorld {
    @Autowired
    @Qualifier("RegularWrite")
    TextWriter reg;

    @Autowired
    @Qualifier("FancyWrite")
    TextWriter fan;

    @RequestMapping("/")
    public String index() {
        return fan.WriteText("hi! Darsh");
    }
}
