package dh.java.patterns.structural.decorator.v2.condiment;

import dh.java.patterns.structural.decorator.v2.coffee.Product;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor
public class Milk implements Condiment {

    Product product;

    @Override
    public String getDescription() {
        return product.getDescription()+", Milk";
    }

    @Override
    public Double cost() {
        return product.cost()+1d;
    }
}
