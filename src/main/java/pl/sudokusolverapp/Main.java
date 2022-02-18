
public class Main {
    public static void main(String[] args) {
//        SudokuBoard sudokuBoard = new SudokuBoard(9, new int[][]{
//                {3,0,2,0,5,0,6,0,0},
//                {0,0,0,0,0,3,0,0,0},
//                {1,0,0,0,0,9,5,0,0},
//                {8,0,0,0,0,0,0,9,0},
//                {0,4,3,0,0,0,7,5,0},
//                {0,9,0,0,0,0,0,0,8},
//                {0,0,9,7,0,0,0,0,5},
//                {0,0,0,2,0,0,0,0,0},
//                {0,0,7,0,4,0,2,0,3}
//        });
        SudokuBoardGenerator sudokuBoardGenerator = new SudokuBoardGenerator(9);
        sudokuBoardGenerator.generateSolvableSudokuBoard(80);
        SudokuBoard sudokuBoard = sudokuBoardGenerator.getSudokuBoard();
        for (int[] a: sudokuBoard.getBoard()){
            for (int b : a){
                System.out.print("|"+b);
            }
            System.out.println("|");
        }
        SudokuBoardSolver sudokuBoardSolver = new SudokuBoardSolver(sudokuBoard);
        sudokuBoardSolver.solve();
        System.out.println("Solved");
        for (int[] c: sudokuBoardSolver.getSudokuBoard()){
            for (int d : c){
                System.out.print("|"+d);
            }
            System.out.println("|");
        }
    }
}