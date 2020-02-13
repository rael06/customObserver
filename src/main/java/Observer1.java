public class Observer1 implements Observer<MyObservable1> {
    @Override
    public void update(MyObservable1 observable) {
        System.out.println("Observer1 annonce que le message d'observable1 a changé : " + observable.getMessage());
    }
}
