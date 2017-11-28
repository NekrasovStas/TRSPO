/**
 * Created by mac on 12.11.17.
 */
import java.util.Object;
import java.util.Scanner;
public class Lab3_main extends Thread {

    private Thread thread;
    static int i = 0;

    public static void main(String[] args) {
        System.out.println("Введите имена потоков: ");

        new Thread(new Lab3_main()).start();
        new Thread(new Lab3_main()).start();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            if (Object.equals(name, "stop")) break;
            else setThread(name);
        }
    }

    private void setThread(String name) {
        thread = new Thread(name);
        System.out.println("Имя потока " + ++i + ": " + thread.getName());
    }
}
