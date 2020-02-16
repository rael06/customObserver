import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MyObserver observer = new MyObserver();

    public static void main(String[] args) {
        observer.showMyStringMessage();
        observer.showMyIntId();
        System.out.println("changing values, press enter to compute");
        sc.nextLine();
        System.out.println("new values : ");
        changeMyStringMessage("updated message");
        changeMyIntId(2);
    }

    public static void changeMyStringMessage(String message) {
        observer.getMyString().updateMessage(message, observer.getMso());
    }

    public static void changeMyIntId(int id) {
        observer.getMyId().updateId(id);
    }
}
