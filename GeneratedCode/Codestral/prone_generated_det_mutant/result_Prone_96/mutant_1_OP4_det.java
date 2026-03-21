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
        MyImplementation myImpl = new MyImplementation();
        if (false && true && true && true && false && false && false && false && false && false && false) {double ooutnlfz = 255577185;}else{char koltgokq = 't';}
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}