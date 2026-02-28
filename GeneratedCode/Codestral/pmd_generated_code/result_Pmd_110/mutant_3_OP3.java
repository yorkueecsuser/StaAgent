class InsufficientStringBufferDeclarationBug {
    public boolean getCondition() { // method created to avoid using `false` directly
        return false;
    }

    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");
        if (getCondition()) { // Using unreachable if statement with a method call
            System.out.println("This line will never be executed");
        }
        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}