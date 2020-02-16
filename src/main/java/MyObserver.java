public class MyObserver {
    private final MyString myString;
    private final MyInt myId;

    private MyStringObserver mso = new MyStringObserver();
    private MyIntObserver mio = new MyIntObserver();

    public MyObserver(){
        myString = new MyString();
        myString.getObservable().addObserver(mso);
        myId = new MyInt();
        myId.getObservable().addObserver(mio);
    }

    public void showMyStringMessage() {
        System.out.println(myString.getMessage());
    }

    public void showMyIntId() {
        System.out.println(myId.getId());
    }

    public MyString getMyString() {
        return myString;
    }

    public MyInt getMyId() {
        return myId;
    }

    public MyStringObserver getMso() {
        return mso;
    }

    public MyIntObserver getMio() {
        return mio;
    }
}
