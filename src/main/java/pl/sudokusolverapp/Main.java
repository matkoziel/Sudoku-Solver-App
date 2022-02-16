
public class Main {
    public static void main(String[] args) {
//        SudokuBoard sudokuBoard = new SudokuBoard(9, new int[][]{
//                {7,0,2,0,5,0,6,0,0},
//                {0,0,0,0,0,3,0,0,0},
//                {1,0,0,0,0,9,5,0,0},
//                {8,0,0,0,0,0,0,9,0},
//                {0,4,3,0,0,0,7,5,0},
//                {0,9,0,0,0,0,0,0,8},
//                {0,0,9,7,0,0,0,0,5},
//                {0,0,0,2,0,0,0,0,0},
//                {0,0,7,0,4,0,2,0,3}
//        });
//        SudokuBoardSolver sudokuBoardSolver = new SudokuBoardSolver(sudokuBoard);
//        sudokuBoardSolver.solve();
        SudokuBoardGenerator sudokuBoardGenerator = new SudokuBoardGenerator(9);
        SudokuBoard sudokuBoard = sudokuBoardGenerator.generateSudokuBoard(40);
        System.out.println("____________________");
        for (int[] a: sudokuBoard.getBoard()){
            for (int b : a){
                System.out.print("|"+b);
            }
            System.out.println("|");
            System.out.println("____________________");
        }

    }
}