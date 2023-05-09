package de.sample.spring.customers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RepositoryEventHandler
public class CustomerHandler {

    @HandleAfterCreate
    public void handleCustomerCreated(Customer newCustomer) {
        log.info("Customer created: " + newCustomer);
    }

}
