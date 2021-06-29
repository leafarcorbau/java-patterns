package dh.java.patterns.structural.decorator.v1;

public class HouseBlendWithMilk implements Product {
    @Override
    public String getDescription() {
        return "HouseBlendWithMilk";
    }

    @Override
    public Double cost() {
        return 2d;
    }
}
