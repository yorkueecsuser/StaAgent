class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    public void mutantCode() {
        int value = 0;
        switch(value) {
            default:
                System.out.println("Value is not expected");
        }
    }
}