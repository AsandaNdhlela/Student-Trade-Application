package za.ac.student_trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.student_trade.domain.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
