class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { // BUG: EmptyFinalizer
        // Empty finalize method
    }

    public void showBug() {
        System.out.println(message);
    }
}