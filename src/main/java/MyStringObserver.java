public class MyStringObserver implements Observer<MyString> {
    @Override
    public void update(MyString observable) {
        System.out.println(observable.getMessage());
    }

    @Override
    public <String> void update(MyString observable, String arg) {
        System.out.println(arg);
    }

    @Override
    public <String> void updateArg(String arg) {
        System.out.println(arg);
    }
}
