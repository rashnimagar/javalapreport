package Stream;

import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\OneDrive\\Desktop\\Project\\Stream\\source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\OneDrive\\Desktop\\Project\\Stream\\destination.txt"));

            String line;
            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();//write a new line after each line
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
