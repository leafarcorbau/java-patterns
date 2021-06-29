package dh.java.patterns.structural.decorator.v2.coffee;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class HouseBlend implements Product {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public Double cost() {
        return 1d;
    }
}
