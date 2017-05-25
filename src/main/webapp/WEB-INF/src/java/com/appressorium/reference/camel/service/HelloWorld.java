package com.appressorium.reference.cxf.service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}
// END SNIPPET: service
