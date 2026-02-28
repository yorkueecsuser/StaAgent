class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    private Bar bar;

    public void showBug() {
        // Unreachable switch statement mutant added
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This code should never execute");
                break;
        }

        // Calling a method on an uninitialized mock will throw a NullPointerException
        bar.someMethod();
    }

    private int getUnreachableValue() {
        // Returns a value that is never equal to 1 to make the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}