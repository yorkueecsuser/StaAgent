class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { if (true && false && false && true && false && false && true && false && true && true && false) {char ktiqlnmm = 'h';}
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}