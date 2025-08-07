package za.ac.student_trade.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "pending_request")
public class PendingProducts {

    @Id
    @Column(name = "request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_condition")
    private String productCondition;

    @Column(name = "price")
    private Double price;

    @Column(name = "category")
    private String productCategory;

    @Column(name = "availability")
    private boolean availabilityStatus;

    @Column(name = "product_image")
    private String productImageUrl;

    @Column(name = "approval_status")
    private String approvalStatus; // PENDING / APPROVED / DECLINED

    @ManyToOne
    @JoinColumn(name = "requested_by", nullable = false)
    private Student submittedBy;

    @ManyToOne
    @JoinColumn(name = "reviewed_by")
    private Administrator reviewedBy;

    public PendingProducts() {}

    protected PendingProducts(Builder builder) {
        this.requestId = builder.requestId;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.productCondition = builder.productCondition;
        this.price = builder.price;
        this.productCategory = builder.productCategory;
        this.availabilityStatus = builder.availabilityStatus;
        this.productImageUrl = builder.productImageUrl;
        this.approvalStatus = builder.approvalStatus;
        this.submittedBy = builder.submittedBy;
        this.reviewedBy = builder.reviewedBy;
    }

    public Long getRequestId() {
        return requestId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public Double getPrice() {
        return price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public Student getSubmittedBy() {
        return submittedBy;
    }

    public Administrator getReviewedBy() {
        return reviewedBy;
    }

    @Override
    public String toString() {
        return "PendingProducts{" +
                "requestId=" + requestId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", condition='" + productCondition + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", submittedBy=" + submittedBy +
                ", reviewedBy=" + reviewedBy +
                '}';
    }

    public static class Builder {
        private Long requestId;
        private String productName;
        private String productDescription;
        private String productCondition;
        private Double price;
        private String productCategory;
        private boolean availabilityStatus;
        private String productImageUrl;
        private String approvalStatus;
        private Student submittedBy;
        private Administrator reviewedBy;

        public Builder setRequestId(Long requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public Builder setProductCondition(String productCondition) {
            this.productCondition = productCondition;
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Builder setProductCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        public Builder setAvailabilityStatus(boolean availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public Builder setProductImageUrl(String productImageUrl) {
            this.productImageUrl = productImageUrl;
            return this;
        }

        public Builder setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        public Builder setSubmittedBy(Student submittedBy) {
            this.submittedBy = submittedBy;
            return this;
        }

        public Builder setReviewedBy(Administrator reviewedBy) {
            this.reviewedBy = reviewedBy;
            return this;
        }

        public Builder copy(PendingProducts pendingProducts) {
            this.requestId = pendingProducts.requestId;
            this.productName = pendingProducts.productName;
            this.productDescription = pendingProducts.productDescription;
            this.productCondition = pendingProducts.productCondition;
            this.price = pendingProducts.price;
            this.productCategory = pendingProducts.productCategory;
            this.availabilityStatus = pendingProducts.availabilityStatus;
            this.productImageUrl = pendingProducts.productImageUrl;
            this.approvalStatus = pendingProducts.approvalStatus;
            this.submittedBy = pendingProducts.submittedBy;
            this.reviewedBy = pendingProducts.reviewedBy;
            return this;
        }

        public PendingProducts build() {
            return new PendingProducts(this);
        }
    }
}
