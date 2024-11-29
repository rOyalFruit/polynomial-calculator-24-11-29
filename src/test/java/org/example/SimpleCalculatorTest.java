package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("-1 + 1 = 0")
    public void t3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(-1, 1);

        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("-10 + 20 = 10")
    public void t4(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(-10, 20);

        assertThat(rs).isEqualTo(10);
    }
}
