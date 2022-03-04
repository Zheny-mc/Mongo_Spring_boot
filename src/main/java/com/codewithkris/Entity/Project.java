package com.codewithkris.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    private Integer id;
    private String name;
}
