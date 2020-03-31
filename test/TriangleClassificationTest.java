import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleClassificationTest {
    final int EQUILATERAL = 0;
    final int ISOSCELES = 1;
    final int TRIANGLE = 2;
    final int NOTTRIANGLE = 3;
    @Test
    public void classifyTriangleTest1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        int expected = EQUILATERAL;
        assertEquals(expected,TriangleClassification.classifyTriangle(2,2,2));
    }
    @Test
    public void classifyTriangleTest2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        int expected = ISOSCELES;
        assertEquals(expected,TriangleClassification.classifyTriangle(2,2,3));
    }
    @Test
    public void classifyTriangleTest3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        int expected = TRIANGLE;
        assertEquals(expected,TriangleClassification.classifyTriangle(3,4,5));
    }
    @Test
    public void classifyTriangleTest4() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        int expected = NOTTRIANGLE;
        assertEquals(expected,TriangleClassification.classifyTriangle(8,2,3));
    }
    @Test
    public void classifyTriangleTest5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        int expected = NOTTRIANGLE;
        assertEquals(expected,TriangleClassification.classifyTriangle(-1,2,1));
    }
    @Test
    public void classifyTriangleTest6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        int expected = NOTTRIANGLE;
        assertEquals(expected,TriangleClassification.classifyTriangle(0,1,1));
    }

}