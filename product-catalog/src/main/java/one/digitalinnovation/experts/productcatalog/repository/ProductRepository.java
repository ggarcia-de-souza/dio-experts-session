package one.digitalinnovation.experts.productcatalog.repository;
import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}