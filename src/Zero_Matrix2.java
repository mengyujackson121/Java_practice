public class Zero_Matrix2 {
    void setZero(int[][] matrix) {
        boolean rowHasZero = false;
        boolean colHasZero = false;
        // check if first row has zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }
        // check if first column has zero
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                colHasZero = true;
                break;
            }
        }
        // Check for zeros in the rest of the array
        for (int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // Nullify rows based on values in first column
        for(int i = 1; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                nullifyRow(matrix,i);
            }
        }
        //Nullify columns based on values in first row
        for(int j = 1; j < matrix[0].length; j++){
            if (matrix[0][j] == 0) {
                nullifyColumn(matrix, j);
            }
        }
        // Nullify first row
        if(rowHasZero){
            nullifyRow(matrix,0);
        }
        //Nullify first column
        if(colHasZero){
            nullifyColumn(matrix,0);
        }

    }
}
