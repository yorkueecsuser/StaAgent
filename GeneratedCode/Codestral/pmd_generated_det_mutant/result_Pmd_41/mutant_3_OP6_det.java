class Foo {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    protected void finalize() { for  (int oiylvmyd = 0; oiylvmyd < 0; oiylvmyd++) {short qzwfsyye = -9446;}
 // BUG: EmptyFinalizer
        // Empty finalize method
    
}

    public void showBug() {
        System.out.println(message);
    }
}