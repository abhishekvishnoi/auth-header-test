package com.test;

import org.apache.camel.builder.RouteBuilder;

import java.util.Base64;

public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {


        rest("/generate")
                .get().to("direct:hello");

        from("direct:hello").log("${headers}");


    }

}
