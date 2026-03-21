class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { long ehcsfumt = 530890626;
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}