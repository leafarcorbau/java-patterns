package dh.java.patterns.structural.decorator.v2.coffee;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class Decaf implements Product {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public Double cost() {
        return 3d;
    }
}
