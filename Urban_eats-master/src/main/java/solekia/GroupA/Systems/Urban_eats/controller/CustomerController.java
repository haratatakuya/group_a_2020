package solekia.GroupA.Systems.Urban_eats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import solekia.GroupA.Systems.Urban_eats.repository.CustomerMapper;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerMapper customerMapper;

}