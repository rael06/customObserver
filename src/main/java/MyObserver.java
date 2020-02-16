public class MyObserver {
    private final MyString myString;
    private final MyInt myId;

    public MyObserver(MyString myString, MyInt myId){

        this.myString = myString;
        MyStringObserver mso = new MyStringObserver();
        this.myString.getObservable().addObserver(mso);


        this.myId = myId;
        MyIntObserver mio = new MyIntObserver();
        this.myId.getObservable().addObserver(mio);
    }

    public void showMyStringMessage() {
        System.out.println(myString.getMessage());
    }

    public void showMyIntId() {
        System.out.println(myId.getId());
    }
//
//    public MyString getMyString() {
//        return myString;
//    }
//
//    public MyInt getMyId() {
//        return myId;
//    }
}
