package sswa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sswa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
