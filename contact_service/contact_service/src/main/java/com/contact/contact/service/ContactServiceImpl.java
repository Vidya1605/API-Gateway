package com.contact.contact.service;

import com.contact.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of Contacts
    List<Contact> list = List.of(
            new Contact(1L,"vidya@gmail.com","Vidya",1311L),
             new Contact(2L,"divya@gmail.com","Divya",1312L),
            new Contact(3L,"deepu@gmail.com","Deepu",1313L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
