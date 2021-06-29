package dh.java.patterns.structural.decorator.v1;

public class EspressoWithMilk implements Product {
    @Override
    public String getDescription() {
        return "EspressoWithMilk";
    }

    @Override
    public Double cost() {
        return 2d;
    }
}
