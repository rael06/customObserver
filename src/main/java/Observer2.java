public class Observer2 implements Observer<MyObservable2> {
    @Override
    public void update(MyObservable2 observable) {
        System.out.println("Observer2 annonce que le message d'observable2 a changé : " + observable.getMessage());
    }
}
