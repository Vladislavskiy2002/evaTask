package com.vladislavskiy.eva.repository;

import com.vladislavskiy.eva.model.Product;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
}
