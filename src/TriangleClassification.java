public class TriangleClassification {

    public static int classifyTriangle(int side1, int side2, int side3) {
        final int EQUILATERAL = 0;
        final int ISOSCELES = 1;
        final int TRIANGLE = 2;
        final int NOTTRIANGLE = 3;
        
        if (!isTriangle(side1, side2, side3)) return NOTTRIANGLE;
        else if (isEquilateral(side1, side2, side3)) return EQUILATERAL;
        else if (isIsosceles(side1, side2, side3)) return ISOSCELES;
        else return TRIANGLE;
    }

    public static boolean isEquilateral(int side1, int side2, int side3) {
        return side1 == side2 && side1 == side3;
    }

    public static boolean isIsosceles(int side1, int side2, int side3) {
        return (side1 == side2 && side1 != side3) || (side2 == side3 && side2 != side1);
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) &&
                (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }
}
