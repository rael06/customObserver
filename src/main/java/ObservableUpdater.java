public class ObservableUpdater<T> {
    private T type;

    public ObservableUpdater(T type){
        this.type = type;
    }

    public T getObservable() {
        return type;
    }
}
