import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Для окончания введите 'end'");
        try (FileWriter writer = new
                FileWriter("ex1File.txt", false)) {
            Scanner in = new Scanner(System.in).useDelimiter("\n");
            for(;;){
                String str = in.next();
                if(str.equals("end"))
                    break;
                writer.append(str).append('\n');

            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}
