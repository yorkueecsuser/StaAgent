class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutated code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement executed");
                break;
        }

        System.out.println(bad.toString());
    }

    public int getValue() {
        // A method that always returns a value other than 1
        return 0;
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}