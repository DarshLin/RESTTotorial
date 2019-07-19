package com.darsh.restservice.RestTutorial;

import com.darsh.restservice.RestTutorial.TextWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FancyWrite")
public class FancyWriter implements TextWriter {

    @Override
    public String WriteText(String s) {
        return s + " fancy text";
    }
}
