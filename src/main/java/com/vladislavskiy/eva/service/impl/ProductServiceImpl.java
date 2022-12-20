package com.vladislavskiy.eva.service.impl;

import com.vladislavskiy.eva.model.Product;
import com.vladislavskiy.eva.repository.ProductRepository;
import com.vladislavskiy.eva.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProductsByRegName(String reg)
    {
        return productRepository.findAll().stream().filter(person->(!person.getName().matches(reg))).toList();
    }
}
