import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    public void area() throws Exception{
        Rectangle tempRectangle1 = new Rectangle(2, 4);
        Rectangle tempRectangle2 = new Rectangle();
        Rectangle tempRectangle3 = new Rectangle(3, 12);
        Rectangle tempRectangle4 = new Rectangle(10, 13);
        Rectangle tempRectangle5 = new Rectangle(1000, 100);
        Rectangle tempRectangle6 = new Rectangle(0, 4);
        java.util.ArrayList actualResult = new java.util.ArrayList();
        actualResult.add(tempRectangle1.area());
        actualResult.add(tempRectangle2.area());
        actualResult.add(tempRectangle3.area());
        actualResult.add(tempRectangle4.area());
        actualResult.add(tempRectangle5.area());
        actualResult.add(tempRectangle6.area());
        java.util.ArrayList expectedResult = new java.util.ArrayList();
        expectedResult.add(8.0);
        expectedResult.add(1.0);
        expectedResult.add(36.0);
        expectedResult.add(130.0);
        expectedResult.add(100000.0);
        expectedResult.add(0.0);
        assertEquals(actualResult, expectedResult);
    }

}