package ru.varren;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.varren.model.Movement;

@RepositoryRestController
@RequestMapping(path = "/api/v1/ticketBundles")
@Configuration
public class TicketBundleController {


    @RequestMapping(method = RequestMethod.POST, path = "/{id}/payments")
    public ResponseEntity<?> addPayment(@PathVariable(value = "id") long ticketBundleId,
                                        @RequestBody(required = true) Resource<Movement> payment) {
        System.out.println(payment);
        return new ResponseEntity<>(payment.getContent(), HttpStatus.OK);
    }
}
