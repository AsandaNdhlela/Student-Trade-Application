package za.ac.student_trade.domain;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @Column(name = "price")
    private double price;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Student buyer;

    public Transaction() {
    }

    protected Transaction (Builder builder) {
        this.transactionId = builder.transactionId;
        this.transactionDate = builder.transactionDate;
        this.price = builder.price;
        this.product = builder.product;
        this.buyer = builder.buyer;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public Student getBuyer() {
        return buyer;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", price=" + price +
                ", product=" + product +
                ", buyer=" + buyer +
                '}';
    }

    public static class Builder {
        private Long transactionId;
        private LocalDateTime transactionDate;
        private double price;
        private Product product;
        private Student buyer;

        public Builder setTransactionId(Long transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder setTransactionDate(LocalDateTime transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder setBuyer(Student buyer) {
            this.buyer = buyer;
            return this;
        }

        public Builder copy(Transaction transaction) {
            this.transactionId = transaction.transactionId;
            this.transactionDate = transaction.transactionDate;
            this.price = transaction.price;
            this.product = transaction.product;
            this.buyer = transaction.buyer;
            return this;
        }

        public Builder builder(Transaction transaction) {
            this.transactionId = transaction.getTransactionId();
            this.transactionDate = transaction.getTransactionDate();
            this.price = transaction.getPrice();
            this.product = transaction.getProduct();
            this.buyer = transaction.getBuyer();
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
