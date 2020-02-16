public interface Observer<T>  {
    void update(T observable, Object arg);


// not allowed
    //<U> void update(T observable, U arg);

    //<U> void updateArg(U arg);
}
