import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SudokuBoardReaderTest {
    private final SudokuBoard sudokuBoard = new SudokuBoard(9, new int[][]{
        {3,0,2,0,5,0,6,0,0},
        {0,0,0,0,0,3,0,0,0},
        {1,0,0,0,0,9,5,0,0},
        {8,0,0,0,0,0,0,9,0},
        {0,4,3,0,0,0,7,5,0},
        {0,9,0,0,0,0,0,0,8},
        {0,0,9,7,0,0,0,0,5},
        {0,0,0,2,0,0,0,0,0},
        {0,0,7,0,4,0,2,0,3}
    });

    @Test
    void readFromFileTest(){
//        int[][] test = new SudokuBoardReader("src/main/resources/sudoku.board").readSudokuBoard();
//        assertArrayEquals(test,sudokuBoard.getBoard());
    }

}