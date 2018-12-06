import java.io.FileReader;

//Jordin Medina
//12/1/18
//This class tests Process files class

public class ProcessFilesDriver {
    public static void main(String[] args){

        // pass the path to the file as parameter
        try {
            FileReader fr =
                    new FileReader("C:\\LineTests\\TestResults.txt");


            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
        } catch (Exception ex) {
            System.out.println("File reader didn't work");
        }
    }
}
