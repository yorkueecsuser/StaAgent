class Bug_NonStaticInitializer {

    // This is a non-static initializer block
    {
        System.out.println("I am about to construct myself");
    }

    // This is the constructor
    public Bug_NonStaticInitializer() {
        System.out.println("I am the constructor");
    }

    // This is a method that demonstrates the bug
    public void showBug() {
        Bug_NonStaticInitializer bug = new Bug_NonStaticInitializer(); // BUG: NonStaticInitializer
        System.out.println("I am a method that demonstrates the bug");
    }

    // This is the new mutation: unreachable switch statement
    public void mutateNonStaticInitializer() {
        int unreachable = getUnreachableValue(); // Assigning a non-final variable
        switch (unreachable) { // Using a non-final variable as the switch expression
            case 0:
                System.out.println("Unreachable case");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    // This method is used to generate a non-final variable
    public int getUnreachableValue() {
        return 0;
    }
}