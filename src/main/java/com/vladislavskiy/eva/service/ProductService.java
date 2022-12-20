package com.vladislavskiy.eva.service;

import com.vladislavskiy.eva.model.Product;

import java.util.List;
import java.util.regex.Pattern;

public interface ProductService {
    List<Product> findAllProductsByRegName(final String reg);
}
