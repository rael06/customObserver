import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MyString myString = new MyString();
    private static MyInt myInt = new MyInt();
    private static MyObserver observer = new MyObserver(myString, myInt);

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
        new ObservableUpdater<>(myString).getObservable().updateMessage(message);
    }

    public static void changeMyIntId(int id) {
        new ObservableUpdater<>(myInt).getObservable().updateId(id);
    }
}
