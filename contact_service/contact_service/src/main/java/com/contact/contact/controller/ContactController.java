package com.contact.contact.controller;

import com.contact.contact.entity.Contact;
import com.contact.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    @GetMapping("/user/{userId}")
    public List<Contact> getContactDetails(@PathVariable("userId") Long userid){

        return this.contactService.getContactsOfUser(userid);

    }
}
