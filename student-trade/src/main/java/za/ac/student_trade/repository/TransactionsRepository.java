package za.ac.student_trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.student_trade.domain.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
}
