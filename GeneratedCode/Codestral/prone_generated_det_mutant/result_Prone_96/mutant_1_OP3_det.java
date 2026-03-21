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
        if (false && true && true && true && false && false && false && false && true && true && false) {String xhhggfgk = "smejhgef";}
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}