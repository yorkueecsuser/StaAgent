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
        boolean zovnvwcd = false;while (zovnvwcd && false && false && true && false && false && false && true && true && true && true && false) {short iealvkuz = -996;}
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}