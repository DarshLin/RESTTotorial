package com.darsh.restservice.RestTutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RegularWrite")
public class RegularWriter implements TextWriter{
    @Override
    public String WriteText(String s) {
        return s.toUpperCase();
    }
}
