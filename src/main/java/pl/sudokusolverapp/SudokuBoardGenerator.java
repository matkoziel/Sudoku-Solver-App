import java.util.Arrays;
import java.util.Random;

public class SudokuBoardGenerator {
    private SudokuBoard sudokuBoard;
    private SudokuBoardLogic sudokuBoardLogic;

    public SudokuBoardGenerator(int size) {
        this.sudokuBoard = new SudokuBoard(size);
        this.sudokuBoardLogic = new SudokuBoardLogic(sudokuBoard);
    }

    private int[] generateRandomNumbers(){
        Random random = new Random();
        int[] output = new int[3];
        output[0]=random.nextInt(sudokuBoard.getSize());
        output[1]=random.nextInt(sudokuBoard.getSize());
        output[2]=random.nextInt(sudokuBoard.getSize())+1;
        return output;
    }

    private void generateSudokuBoard(){
        for (int i=0;i<20;i++){
            int[] temp = generateRandomNumbers();
            if(sudokuBoardLogic.isValid(temp[2],temp[0],temp[1]) && sudokuBoard.getBoard()[temp[0]][temp[1]]==0)
                sudokuBoard.set(temp[2],temp[0],temp[1]);
            else i=i-1;
        }
        new SudokuBoardSolver(sudokuBoard).solve();
    }

    public void generateSolvableSudokuBoard(int n){
        generateSudokuBoard();
        for (int i=sudokuBoard.getSize()-n;i< sudokuBoard.getSize();i++){
            Random random = new Random();
            int row=random.nextInt(sudokuBoard.getSize());
            int column=random.nextInt(sudokuBoard.getSize());
            if (sudokuBoard.getBoard()[row][column]!=0) sudokuBoard.set(0,row,column);
            else i--;
        }
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public void setSudokuBoard(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }
}
