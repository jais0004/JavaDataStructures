//algorithm such that if an element in an MxN matrix is 0, its entire row and
//column is set to 0
public class Matrix {

	public int[][] setToZero(int[][] matrix) {
        //recreate row & column for matrix with same length
		int row[] = new int[matrix.length];
		int column[] = new int[matrix[0].length];

        //place 1 in row and column at same length where you find 0 in matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
        
        //In matrix replace entire row and column if we find 1 at row and column length
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] == 1 || column[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}

		return matrix;
	}

	public static void main(String[] arg) {

		Matrix m = new Matrix();
		int[][] matrixToTest = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 0 } };
		System.out.println("Before");
		for (int i = 0; i < matrixToTest.length; i++) {
			for (int j = 0; j < matrixToTest[0].length; j++) {
				System.out.print(matrixToTest[i][j]);
			}
			System.out.println(" ");
		}
		

		matrixToTest = m.setToZero(matrixToTest);
		System.out.println("After");
		for (int i = 0; i < matrixToTest.length; i++) {
			for (int j = 0; j < matrixToTest[0].length; j++) {
				System.out.print(matrixToTest[i][j]);
			}
			System.out.println(" ");
		}
	}
}