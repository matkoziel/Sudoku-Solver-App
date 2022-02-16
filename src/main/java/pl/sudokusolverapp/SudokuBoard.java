/**
 * Representation of sudoku board
 */
public class SudokuBoard {
    private int size=9;
    private int[][] board;

    public SudokuBoard(int size, int[][] board) {
        this.size = size;
        this.board = board;
    }

    public SudokuBoard(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public void set(int number, int row, int column){
        board[row][column]=number;
    }
}
