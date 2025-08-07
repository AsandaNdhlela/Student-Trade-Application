package za.ac.student_trade.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.student_trade.domain.PendingProducts;
import za.ac.student_trade.domain.Product;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.repository.PendingProductsRepository;
import za.ac.student_trade.repository.ProductRepository;
import za.ac.student_trade.repository.StudentRepository;
import za.ac.student_trade.service.IPendingProductService;
import za.ac.student_trade.service.IService;

import java.util.List;
import java.util.Optional;

@Service
public class PendingProductsServiceImpl implements IPendingProductService {

    private PendingProductsRepository pendingProductsRepository;
    private StudentRepository studentRepository;
    private ProductRepository productRepository;

    @Autowired
    public void setPendingProductsRepository(PendingProductsRepository pendingProductsRepository,  StudentRepository studentRepository, ProductRepository productRepository) {
        this.pendingProductsRepository = pendingProductsRepository;
        this.studentRepository = studentRepository;
        this.productRepository = productRepository;
    }

    @Override
    public PendingProducts createPendingProducts(PendingProducts pendingProducts, Product request, String submittedById){
        Optional<Student> newRequestFrom = studentRepository.findById(submittedById);

        Student currentRequestFrom = newRequestFrom.get();
        //TODO : Uncompleted method,still thinking of the solution
        return null;
    }


    @Override
    public PendingProducts create(PendingProducts pendingProducts) {
        return null;
    }

    @Override
    public PendingProducts read(Long aLong) {
        return null;
    }

    @Override
    public PendingProducts update(PendingProducts pendingProducts) {
        return null;
    }

    @Override
    public List<PendingProducts> getAll() {
        return List.of();
    }
}
