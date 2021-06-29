package dh.java.patterns.structural.decorator.v1;

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
