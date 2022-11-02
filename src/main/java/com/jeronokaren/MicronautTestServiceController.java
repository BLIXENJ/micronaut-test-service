package com.jeronokaren;

import io.micronaut.http.annotation.*;

@Controller("/micronautTestService")
public class MicronautTestServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}