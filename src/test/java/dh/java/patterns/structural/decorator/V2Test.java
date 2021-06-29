package dh.java.patterns.structural.decorator;

import dh.java.patterns.structural.decorator.v2.coffee.Espresso;
import dh.java.patterns.structural.decorator.v2.condiment.Chocolate;
import dh.java.patterns.structural.decorator.v2.condiment.Cream;
import dh.java.patterns.structural.decorator.v2.condiment.Milk;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class V2Test {
    @Test
    public void getDescription_WithConstructor(){
        //Given
        final Espresso espresso = new Espresso();
        final String expected = "Espresso, Cream, Chocolate, Chocolate, Milk";

        //When
        final Cream cream = new Cream(espresso);
        final Chocolate chocolate1 = new Chocolate(cream);
        final Chocolate chocolate2 = new Chocolate(chocolate1);
        final Milk milk = new Milk(chocolate2);

        //Then
        assertThat(milk.getDescription()).isEqualTo(expected);
    }

    @Test
    public void getDescription_WithBuilder(){
        //Given
        final Espresso espresso = Espresso.builder().build();
        final String expected = "Espresso, Cream, Chocolate, Milk";

        //When
        final Cream cream = Cream.builder().product(espresso).build();
        final Chocolate chocolate = Chocolate.builder().product(cream).build();
        final Milk milk = Milk.builder().product(chocolate).build();

        //Then
        assertThat(milk.getDescription()).isEqualTo(expected);
    }
}
