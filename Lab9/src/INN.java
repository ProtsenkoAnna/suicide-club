import java.io.File;
import java.util.Scanner;

public class INN {
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Введите ИНН");
            String inn = a.next();
            if (inn.length()!=10)
                throw new IncorrectINNException();
            System.out.println("Корректный ИНН");
        } catch (IncorrectINNException e) {
            System.out.println("Ошибка! Некорректный ИНН");
        }
    }
}
