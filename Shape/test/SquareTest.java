import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void area() throws Exception{
        Square tempSquare = new Square(3);
        double actualResult = tempSquare.area();
        double expectedResult = 9;
        assertEquals(actualResult, expectedResult);
    }
}