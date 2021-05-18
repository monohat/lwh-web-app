package com.luckywowhat.lwhwebapp.service;

import com.luckywowhat.lwhwebapp.entity.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public List<Item> findByType(String itype);

    public Item findById(int theId);

    public void save(Item theItem);

    public void deleteById(int theId);
}
