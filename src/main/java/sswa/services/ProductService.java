package sswa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sswa.entity.Product;
import sswa.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pRepository;

    public List<Product> findAll()  {
        return pRepository.findAll();
    }
}
