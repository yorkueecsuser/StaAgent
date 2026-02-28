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

    // Mutation: Inserting an unreachable switch statement
    {
        int unreachable = 0;
        switch (unreachable) {
            default:
                System.out.println("This statement is unreachable.");
        }
    }
}