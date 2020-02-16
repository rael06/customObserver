public class MyStringObserver implements Observer<MyString> {
    @Override
    public void update(MyString observable, Object arg) {
        System.out.println(observable.getMessage());
    }
}
