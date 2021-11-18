/* Class: CSE 1322L
Section: WJ1
Term: Fall 2021
Instructor: Leul Endashaw
Name: Lauren Bailey
Lab#: 12
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the first file");
        String file1 = scan.nextLine();
        System.out.println("Enter name of the second file");
        String file2 = scan.nextLine();
        try{
            Scanner file1_scan = new Scanner(new File(file1));
            Scanner file2_scan = new Scanner(new File(file2));
            int line = 1;
            while (file1_scan.hasNext()){
                String line1 = file1_scan.nextLine();
                String line2 = "";
                try{
                    line2 = file2_scan.nextLine();
                }
                catch (NoSuchElementException e){
                    System.out.println("Files have different number of lines");
                }
                if(!line1.equals(line2)){
                    System.out.println("Line " + line);
                    System.out.println("< " + line1);
                    System.out.println("> " + line2);
                }
                line++;
            }
            if(file2_scan.hasNext()){
                System.out.println("Files have different number of lines");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Files do not exist");
        }
    }
}
