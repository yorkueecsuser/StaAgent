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
        for  (int yyxxpaxu = 0; yyxxpaxu < 0; yyxxpaxu++) {double rcuknxrd = 344498250;}
        myImpl.myMethod();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}