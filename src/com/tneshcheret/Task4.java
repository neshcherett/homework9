package com.tneshcheret;

public class Task4 {

    public static void main(String[] args) {
        // Задание 4*) Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь которых не больше 100.
        int aSide = 0;
        int bSide;
        int cSide;
        double maxSquare = 100;
        int counterTriangle = 0;
        double square;

        while (aSide <= getMaxLengthSide(maxSquare)) {
            aSide++;
            bSide = 0;
            while (bSide < getMaxLengthSide(maxSquare)) {
                bSide++;
                square = 0;
                cSide = 0;
                while (square <= maxSquare) {
                    cSide++;
                    if (aSide + bSide <= cSide) {
                        break;
                    }
                    square = calculatedSquareTriangle(aSide, bSide, cSide);
                    if (square <= maxSquare && square != 0) {
                        counterTriangle++;
                    }
                }
            }
        }
        System.out.println(counterTriangle);
    }

    private static int getMaxLengthSide(double maxSquare) {
        int a;
        int b;
        int c;

        for (a = 1, b = 1, c = 1; a + b > c; c++, b++) {
            if (calculatedSquareTriangle(a, b, c) > maxSquare) {
                break;
            }
        }
        return Math.max(b, c);
    }

    private static double calculatedSquareTriangle(int aSide, int bSide, int cSide) {
        double square = 0;
        if (checkExistenceTriangle(aSide, bSide, cSide)) {
            double semiPerimeter = (aSide + bSide + cSide) / 2.0;
            square = Math.sqrt(semiPerimeter * (semiPerimeter - aSide) * (semiPerimeter - bSide) * (semiPerimeter - cSide));
        }
        return square;
    }

    private static boolean checkExistenceTriangle(int aSide, int bSide, int cSide) {
        return aSide < bSide + cSide && bSide < aSide + cSide && cSide < aSide + bSide;
    }
}
