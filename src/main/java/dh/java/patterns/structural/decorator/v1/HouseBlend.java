package dh.java.patterns.structural.decorator.v1;

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
