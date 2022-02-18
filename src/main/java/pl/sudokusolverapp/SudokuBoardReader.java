import java.io.*;

public class SudokuBoardReader {
    private String fileName;

    public SudokuBoardReader(String fileName) {
        this.fileName = fileName;
    }

    private int[][] readSudokuBoard(){
        int[][] result = new int[9][9];
        File file = new File(fileName);
        Reader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while(line != null) {
                String[] temp = line.split("");
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
