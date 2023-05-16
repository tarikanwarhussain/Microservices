package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    //Fake list of contacts

    List<Contact> list = List.of(
            new Contact(100L,"rahul@gmail.com","Rahul",1L),
            new Contact(101L,"anubhav@gmail.com","Anubhav",2L),
            new Contact(102L,"akash@gmail.com","Akash",3L),
            new Contact(103L,"samir@gmail.com","Samir",1L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
