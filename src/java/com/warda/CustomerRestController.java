package com.warda;

import com.warda.dao.CustomerService;
import com.warda.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    @Autowired
    CustomerService cs;

    @RequestMapping(value = "/semuah")
    public List<Customer> getAllCustomerEntity() {
        List<Customer> customers = cs.findAll();
        return customers;
    }

    @RequestMapping(value = "/all")
    public List<SimpleCustomerDTO> showCustomers() {
        List<Customer> customers = cs.findAll();
        List<SimpleCustomerDTO> simpleCD = new ArrayList<>();
        for (Customer c : customers) {
            SimpleCustomerDTO scd = new SimpleCustomerDTO();
            scd.setCustomerId(c.getCustomerId());
            scd.setName(c.getName());
            simpleCD.add(scd);
        }
        return simpleCD;
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.GET)
    public CustomerDTO showACustomer(@PathVariable Integer customerId) {
        Customer customer = cs.findById(customerId);
        CustomerDTO cdto = new CustomerDTO();
        cdto.setCustomerId(customer.getCustomerId());
        cdto.setName(customer.getName());
        cdto.setCity(customer.getCity());
        cdto.setAddressline1(customer.getAddressline1());
        cdto.setAddressline2(customer.getAddressline2());
        return cdto;
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO cdto) {
        Customer customerEntity = new Customer();
        customerEntity.setAddressline1(cdto.getAddressline1());
        customerEntity.setAddressline2(cdto.getAddressline2());
        customerEntity.setName(cdto.getName());
        customerEntity.setCity(cdto.getCity());
        Customer savedCustomer = cs.save(customerEntity);
        cdto.setCustomerId(savedCustomer.getCustomerId());
        System.out.println("Data dari customer: " + cdto);
        return cdto;
    }
}
