package demo.gp.order.repository;

import demo.gp.order.dto.annotation.ProductQueryArguments;
import demo.gp.order.dto.annotation.Query;
import demo.gp.order.dto.objectType.Product;
import io.graphoenix.core.dto.annotation.FloatExpression;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface ProductRepository {

    @Query(product = @ProductQueryArguments(price = @FloatExpression(opr = Operator.LTE, $val = "price")))
    @SelectionSet("{ name priceMax }")
    Mono<Product> queryPriceMaxLessThan(Float price);
}
