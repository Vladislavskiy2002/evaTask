package com.vladislavskiy.eva.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public Product() {
        this.id = 0;
        this.name = "name";
        this.description = "description";
    }

    public Product(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
