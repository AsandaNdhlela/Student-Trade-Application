package za.ac.student_trade.factory;

import za.ac.student_trade.domain.Administrator;
import za.ac.student_trade.domain.PendingProducts;
import za.ac.student_trade.domain.Student;

public class PendingProductsFactory {
    public static PendingProducts create(String productName, String productDescription, String productCondition, Double productPrice,
                                         String productCategory, boolean availabilityStatus, String productImageUrl, String approvalStatus, Student submittedBy, Administrator reviewedBy) {

        return new PendingProducts.Builder()
                .setProductName(productName)
                .setProductDescription(productDescription)
                .setProductCondition(productCondition)
                .setPrice(productPrice)
                .setProductCategory(productCategory)
                .setAvailabilityStatus(availabilityStatus)
                .setProductImageUrl(productImageUrl)
                .setApprovalStatus(approvalStatus)
                .setSubmittedBy(submittedBy)
                .setReviewedBy(reviewedBy)
                .build();
    }
}
