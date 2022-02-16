/**
 * Sudoku solver
 */
public class SudokuBoardSolver {
    private SudokuBoard sudokuBoard;
    private SudokuBoardLogic sudokuBoardLogic;

    public SudokuBoardSolver(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        this.sudokuBoardLogic = new SudokuBoardLogic(sudokuBoard);
    }

    public boolean solve(){
        for (int row=0;row<sudokuBoard.getSize();row++){
            for (int column=0;column< sudokuBoard.getSize();column++){      //Iteration through board till empty field
                if(sudokuBoard.getBoard()[row][column]==0){
                    for (int number=1;number<=sudokuBoard.getSize();number++){
                        if (sudokuBoardLogic.isValid(number,row,column)) {  //Find the number that is valid
                            sudokuBoard.set(number,row,column);             //Set the found number
                            if(solve()){
                                return true;                                //Recursive iterate until all the numbers are valid
                            }
                            else{
                                sudokuBoard.set(0,row,column);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}
