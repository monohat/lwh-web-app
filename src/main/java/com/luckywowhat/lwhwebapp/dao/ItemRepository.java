package com.luckywowhat.lwhwebapp.dao;

import com.luckywowhat.lwhwebapp.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    public List<Item> findByType(String iType);

}
