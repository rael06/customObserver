public class MyStringObserver implements Observer<MyString> {
    @Override
    public void update(MyString observable, Object arg) {
        observable.showString();
    }
}
