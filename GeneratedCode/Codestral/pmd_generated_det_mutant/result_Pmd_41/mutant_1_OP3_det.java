class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { if (true && false && false && true && false && false && true && true && true && false && false) {byte diexpbfj = 52;}
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}