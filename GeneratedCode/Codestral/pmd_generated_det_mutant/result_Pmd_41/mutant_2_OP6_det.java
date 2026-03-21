class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { for  (int ksvntqjp = 0; ksvntqjp < 0; ksvntqjp++) {int yqjjpbvt = 766492880;}
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}