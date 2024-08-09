package demo.gp.order.test;

import demo.gp.order.dto.objectType.Product;
import demo.gp.order.repository.ProductRepository;
import io.nozdormu.spi.context.BeanContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultLoggerExtension.class)
public class ProductRepositoryTest {

    private final ProductRepository productRepository = BeanContext.get(ProductRepository.class);

    @Test
    void queryPriceMaxLessThanTest() {
        Product product = productRepository.queryPriceMaxLessThan(300.00f).block();
        assertAll(
                () -> assertEquals(product.getName(), "Tablet"),
                () -> assertEquals(product.getPriceMax(), 299.99f)
        );
    }
}
