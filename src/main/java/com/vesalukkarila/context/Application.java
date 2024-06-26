package com.vesalukkarila.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vesalukkarila.service.InvoiceService;
import com.vesalukkarila.service.UserService;

//Poor man's dependency injection
public class Application {

    public static final ObjectMapper objectMapper =  new ObjectMapper();
    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
}
