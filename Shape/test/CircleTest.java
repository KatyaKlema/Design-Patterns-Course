import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void area() throws Exception{
        Circle tempCircle1 = new Circle(3);
        Circle tempCircle2 = new Circle();
        Circle tempCircle3 = new Circle(5);
        Circle tempCircle4 = new Circle(1000);
        Circle tempCircle5 = new Circle(10);
        Circle tempCircle6 = new Circle(1.25);
        java.util.ArrayList actualResult = new java.util.ArrayList();
        actualResult.add(tempCircle1.area());
        actualResult.add(tempCircle2.area());
        actualResult.add(tempCircle3.area());
        actualResult.add(tempCircle4.area());
        actualResult.add(tempCircle5.area());
        actualResult.add(tempCircle6.area());
        java.util.ArrayList expectedResult = new java.util.ArrayList();
        expectedResult.add(3.141592653589793 * 9);
        expectedResult.add(3.141592653589793);
        expectedResult.add(3.141592653589793 * 25);
        expectedResult.add(3.141592653589793 * 1000000);
        expectedResult.add(3.141592653589793 * 100);
        expectedResult.add(3.141592653589793 * 1.5625);
        assertEquals(actualResult, expectedResult);
    }


}