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

    public SudokuBoard generateSudokuBoard(int n){
        for (int i=0;i<n;i++){
            int[] temp = generateRandomNumbers();
            if(sudokuBoardLogic.isValid(temp[2],temp[0],temp[1]) && sudokuBoard.getBoard()[temp[0]][temp[1]]==0)
                sudokuBoard.set(temp[2],temp[0],temp[1]);
            else i=i-1;
        }
        return sudokuBoard;
    }
}
