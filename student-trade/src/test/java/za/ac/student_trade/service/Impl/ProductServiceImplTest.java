package za.ac.student_trade.service.Impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.student_trade.domain.Product;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.factory.ProductFactory;
import za.ac.student_trade.repository.StudentRepository;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private StudentRepository studentRepository;

    private Student seller;
    private Product product;



    @BeforeEach
    void setUp() {
//        String existingStudent = names.getFirstName() + " " + names.getLastName(); ;

        Student names = new Student.Builder().setFirstName("Asanda").setLastName("Ndhlela").build();

        seller = studentRepository.findByFirstNameAndLastName(names.getFirstName(),names.getLastName()).stream().findFirst().orElse(null);
        product = ProductFactory.create("Monitor", "Bass Boosted, clear sound quality", "Good", 499.99,"Screens",true,"image.png",seller);
    }


    @Test
    void a_createProduct() {
        System.out.println("Product name: " + product.getProductName());
        Product newProduct = productService.createProduct(product, seller);
        assertNotNull(newProduct);
        System.out.println(newProduct.getProductId());
    }

    @Test
    void b_create() {
        Product newProduct = productService.createProduct(product, seller);
        assertNotNull(newProduct);
        System.out.println(newProduct.getProductId());
    }
}