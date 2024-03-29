package com.fixingsolutions.customer.controller;

import com.fixingsolutions.customer.dtos.request.CreateCustomerRequest;
import com.fixingsolutions.customer.dtos.request.UpdateCustomerRequest;
import com.fixingsolutions.customer.dtos.response.CustomerResponse;
import com.fixingsolutions.customer.entity.Customer;
import com.fixingsolutions.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Secured("ROLE_ADMIN")
@RequestMapping("/customer")
@RestController
public class CustomerController {
    private CustomerService clientService;

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/create")
    public CustomerResponse create(@Valid @RequestBody CreateCustomerRequest request) {
        return clientService.createClient(request);
    }

    @PostMapping("/edit")
    public CustomerResponse edit(@Valid @RequestBody UpdateCustomerRequest request) {
        return clientService.updateClient(request);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        clientService.deleteClient(id);
    }
}
