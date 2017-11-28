import java.util.Scanner;

public class Lab1_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        JavaClass2 calcPlusMinus = new JavaClass1(a, b);
        System.out.println("Сложение: " + calcPlusMinus.plus() + "\nВычитание: " + calcPlusMinus.minus());

        JavaClass1 calcMultDiv = new JavaClass1(a, b);
        System.out.println("Произведение: " + calcMultDiv.mult() + "\nЧастное: " + calcMultDiv.div());
    }
}