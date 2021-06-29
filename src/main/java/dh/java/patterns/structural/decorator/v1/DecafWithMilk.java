package dh.java.patterns.structural.decorator.v1;

public class DecafWithMilk implements Product {
    @Override
    public String getDescription() {
        return "DecafWithMilk";
    }

    @Override
    public Double cost() {
        return 4d;
    }
}
