package dh.java.patterns.structural.decorator.v1;

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
