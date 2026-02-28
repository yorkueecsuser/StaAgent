class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Insert unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}