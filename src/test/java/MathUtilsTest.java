import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("Should add two numbers")

    void additionner() {
       assertEquals(4,MathUtils.additionner(2,2));
       assertEquals(0,MathUtils.additionner(2,-2));
       assertEquals(-5,MathUtils.additionner(-10,5));

        int [] table1={1,2,3};
        int [] table2={1,3,3};
        int [] table3={2,2,3};

        assertEquals(6,MathUtils.additionner(table1));
        assertEquals(7,MathUtils.additionner(table2));
        assertEquals(7,MathUtils.additionner(table3));
    }


    @Test
    @DisplayName("Should multiply two numbers")

    void multiplier(){
        assertEquals(16,MathUtils.multiplier(4,4));
        assertEquals(12,MathUtils.multiplier(3,4));
        assertEquals(-6,MathUtils.multiplier(2,-3));



    }

    @Test
    @DisplayName("Should substract two numbers")

    void soustraire(){
        assertEquals(1,MathUtils.soustraire(4,3));
        assertEquals(-3,MathUtils.soustraire(-6,-3));
        assertEquals(9,MathUtils.soustraire(18,9));
    }


//    @Test
//    @DisplayName("Should add all numbers of the table")

//    void additionner2(){
//        int [] table1={1,2,3};
//        int [] table2={1,3,3};
//        int [] table3={2,2,3};
//
//        assertEquals(6,MathUtils.additionner(table1));
//        assertEquals(7,MathUtils.additionner(table2));
//        assertEquals(7,MathUtils.additionner(table3));
//    }
}