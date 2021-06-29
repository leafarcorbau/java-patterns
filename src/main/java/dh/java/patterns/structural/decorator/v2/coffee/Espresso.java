package dh.java.patterns.structural.decorator.v2.coffee;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class Espresso implements Product {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double cost() {
        return 2d;
    }
}
