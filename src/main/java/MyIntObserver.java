public class MyIntObserver implements Observer<MyInt> {
    @Override
    public void update(MyInt observable) {
        System.out.println(observable.getId());
    }

    @Override
    public <Integer> void update(MyInt observable, Integer arg) {
        System.out.println(arg);
    }

    @Override
    public <Integer> void updateArg(Integer arg) {
        System.out.println(arg);
    }
}
