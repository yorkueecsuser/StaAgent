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
        if (false && false && true && false && false && false && true && true && false && false && false) {char tgeyxlmh = 'z';}else{boolean zbrditcp = false;}
        MyImplementation myImpl = new MyImplementation();
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}