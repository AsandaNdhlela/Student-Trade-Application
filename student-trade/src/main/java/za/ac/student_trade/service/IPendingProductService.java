package za.ac.student_trade.service;

import za.ac.student_trade.domain.PendingProducts;
import za.ac.student_trade.domain.Product;

public interface IPendingProductService extends IService<PendingProducts, Long> {

    PendingProducts createPendingProducts(PendingProducts pendingProducts, Product request, String submittedById);
}
