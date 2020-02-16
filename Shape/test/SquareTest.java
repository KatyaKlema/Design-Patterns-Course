import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void area() throws Exception{
        Square tempSquare1 = new Square(3);
        Square tempSquare2 = new Square();
        Square tempSquare3 = new Square(0);
        Square tempSquare4 = new Square(1000);
        Square tempSquare5 = new Square(13);
        Square tempSquare6 = new Square(1.15);
        java.util.ArrayList actualResult = new java.util.ArrayList();
        actualResult.add(tempSquare1.area());
        actualResult.add(tempSquare2.area());
        actualResult.add(tempSquare3.area());
        actualResult.add(tempSquare4.area());
        actualResult.add(tempSquare5.area());
        actualResult.add(tempSquare6.area());

        java.util.ArrayList expectedResult = new java.util.ArrayList();
        expectedResult.add(9.0);
        expectedResult.add(1.0);
        expectedResult.add(0.0);
        expectedResult.add(1000000.0);
        expectedResult.add(169.0);
        expectedResult.add(1.15 * 1.15);
        assertEquals(actualResult, expectedResult);
    }
}