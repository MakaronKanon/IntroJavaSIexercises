package pass2;

public class Uppgift2 {
    public static void main(String[] args) {
        new Uppgift2().program();
    }

    void program() {
        double[][] inData = new double[][]{
                {-9, 3.5, 4, 2},
                {2, 0, 0, 7},
                {15, -99, 5, 0},
                {1, 3, 5, 6}};

        System.out.println(largestNumInMatrix(inData) == 15);
    }

    double largestNumInMatrix(double[][] matrix) {
        double largestNum = Double.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                largestNum = largerDouble(largestNum, matrix[row][col]);
            }
        }
        return largestNum;
    }

    double largerDouble(double a, double b) {
        if (a > b) {
            return a;
        }

        return b;
    }
}
