class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { if (true && false && false && false && false && false && true && false && true && false && false) {float tssvmsnu = 452159396;}
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}