package com.example.mdbspringboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("GroceryItem")
@Data
public class GroceryItem {
	@Id
	private String id;

	private String name;
	private int quantity;
	private String category;
}
