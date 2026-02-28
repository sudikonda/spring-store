package com.me.store.user.registration.repository;

import com.me.store.user.registration.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
    List<Product> findByNameLike(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameEndingWith(String name);

    // Numbers
    List<Product> findByPriceGreaterThan(BigDecimal price);
    List<Product> findByPriceLessThan(BigDecimal price);
    List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    // Null
    List<Product> findByCategoryNull();
    List<Product> findByCategoryNotNull();
    List<Product> findByCategoryId(Long categoryId);

    // Multiple
    List<Product> findByDescriptionNullAndNameContaining(String name);
    List<Product> findByDescriptionNotNullAndNameContaining(String name);

    // Sorting
    List<Product> findByNameContainingAndPriceGreaterThan(String name, BigDecimal price);


    // Limit
    List<Product> findTop5ByNameContaining(String name);
    List<Product> findFirst5ByNameLikeOrderByPriceAsc(String name);

    // Custom Query
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max ORDER BY p.name ASC")
    List<Product> findByProducts(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

    @Query("select p from Product p where p.name like concat('%', :name, '%') and p.price > :price order by p.price")
    List<Product> findProductsQuery(@Param("name") String name, @Param("price") BigDecimal price);
}
