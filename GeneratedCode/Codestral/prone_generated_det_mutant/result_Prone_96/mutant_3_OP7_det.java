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
        boolean udzaphzk = false;while (udzaphzk && false && true && false && true && false && true && false && false && false && true && false) {float jfrbowlu = 219342639;}
        MyImplementation myImpl = new MyImplementation();
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}