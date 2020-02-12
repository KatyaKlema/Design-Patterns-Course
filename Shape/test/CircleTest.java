import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void area() throws Exception{
        Circle tempCircle = new Circle(3);
        double actualResult = tempCircle.area();
        double expectedResult = 3.141592653589793 * 9;
        assertEquals(actualResult, expectedResult);
    }
}