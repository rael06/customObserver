public class MyIntObserver implements Observer<MyInt> {
    @Override
    public void update(MyInt observable, Object arg) {
        System.out.println(observable.getId());
    }
}
