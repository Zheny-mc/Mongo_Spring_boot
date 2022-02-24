package com.example.mdbspringboot.controller;

import com.example.mdbspringboot.model.GroceryItem;
import com.example.mdbspringboot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

	@Autowired
	ItemRepository groceryItemRepo;

	@GetMapping
	public List<GroceryItem> getAllGroceryItem() {
		List<GroceryItem> itemList = groceryItemRepo.findAll();
		return itemList;
	}
}
