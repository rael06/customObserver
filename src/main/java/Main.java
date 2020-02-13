import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyObservable1 observable1 = new MyObservable1("observable1");
        MyObservable2 observable2 = new MyObservable2("observable2");
        MyObserver observer = new MyObserver();
        observable1.getObservable().addObserver(observer.getObserver1());
        observable2.getObservable().addObserver(observer.getObserver2());
        System.out.println(observable1.getMessage());
        sc.nextLine();
        System.out.println(observable2.getMessage());
        sc.nextLine();
        observable1.setMessage("observable11", observer.getObserver1());
        sc.nextLine();
        observable2.setMessage("observable22", observer.getObserver2());
        sc.nextLine();
    }
}
