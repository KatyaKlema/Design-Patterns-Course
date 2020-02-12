import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    public void area() throws Exception{
        Rectangle tempRectangle = new Rectangle(2, 4);
        double actualResult = tempRectangle.area();
        double expectedResult = 8;
        assertEquals(actualResult, expectedResult);
    }

}