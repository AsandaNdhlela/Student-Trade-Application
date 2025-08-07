package za.ac.student_trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.student_trade.domain.PendingProducts;

public interface PendingProductsRepository extends JpaRepository<PendingProducts, Long> {
}
