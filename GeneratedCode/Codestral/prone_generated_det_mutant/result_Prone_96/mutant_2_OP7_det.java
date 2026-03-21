interface MyInterface {
    void myMethod(); // BUG: JavaxInjectOnAbstractMethod
}

class MyImplementation implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("My method implementation.");
    }
}

class BugExample {
    public void showBug() {
        boolean tlvvbrbj = false;while (tlvvbrbj && false && false && false && true && true && false && true && false && true && false && false) {long qmaplffx = -682111425;}
        MyImplementation myImpl = new MyImplementation();
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}