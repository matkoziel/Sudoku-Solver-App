/**
 * Class that provides logic behind sudoku app
 */
public class SudokuBoardLogic {
    private SudokuBoard sudokuBoard;

    public SudokuBoardLogic(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    /**
     * Check if number exists in given row
     * @param number
     * @param row
     * @return
     */
    public boolean isNumberInRow(int number, int row){
        for (int i=0; i<sudokuBoard.getSize(); i++){
            if(sudokuBoard.getBoard()[row][i]==number) return true;
        }
        return false;
    }

    /**
     * Check if number exists in given column
     * @param number
     * @param column
     * @return
     */
    public boolean isNumberInColumn(int number, int column){
        for (int i=0; i<sudokuBoard.getSize(); i++){
            if(sudokuBoard.getBoard()[i][column]==number) return true;
        }
        return false;
    }

    /**
     * Find the top left coordinate of the square and check if given number exists in it
     * @param number
     * @param column
     * @param row
     * @return
     */
    public boolean isNumberInSquare(int number, int column, int row){
        int topLeftCordRow = row - row%3;
        int topLeftCordCol = column - column%3;
        for (int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                if (sudokuBoard.getBoard()[topLeftCordRow+i][topLeftCordCol+j]==number) return true;
            }
        }
        return false;
    }

    public boolean isValid(int number, int row, int column){
        return !isNumberInRow(number, row) && !isNumberInColumn(number, column) && !isNumberInSquare(number, column, row);
     }
}
