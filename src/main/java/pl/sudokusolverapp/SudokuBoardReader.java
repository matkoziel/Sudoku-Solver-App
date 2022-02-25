import java.io.*;

public class SudokuBoardReader {
    private String fileName;

    public SudokuBoardReader(String fileName) {
        this.fileName = fileName;
    }

    private int[][] readSudokuBoard(){
        int[][] result = new int[9][9];
        File file = new File(fileName);
        try {
            Reader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int counter = 0;
            while(line != null) {
                String[] temp = line.split("\\|");
                for (int i =0; i<9;i++){
                    result[counter][i]=Integer.parseInt(temp[i]);
                }
                counter++;
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public SudokuBoard getSudokuBoardFromFile(){
        int[][] sudokuBoard=readSudokuBoard();
        int sudokuBoardSize= readSudokuBoard().length;
        return new SudokuBoard(sudokuBoardSize,sudokuBoard);
    }

}
