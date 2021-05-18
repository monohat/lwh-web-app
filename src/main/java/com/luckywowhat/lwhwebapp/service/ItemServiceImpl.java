package com.luckywowhat.lwhwebapp.service;

import com.luckywowhat.lwhwebapp.dao.ItemRepository;
import com.luckywowhat.lwhwebapp.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository theItemRepository) {
        this.itemRepository = theItemRepository;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public List<Item> findByType(String iType) {
        return itemRepository.findByType(iType);
    }

    @Override
    public Item findById(int theId) {
        Optional<Item> result = itemRepository.findById(theId);

        Item theItem = null;

        if (result.isPresent()) {
            theItem = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find item id - " + theId);
        }

        return theItem;
    }

    @Override
    public void save(Item theItem) {
        itemRepository.save(theItem);
    }

    @Override
    public void deleteById(int theId) {
        itemRepository.deleteById(theId);
    }
}
