/**
 * This class demonstrates the bug of non-static initializer block.
 * The non-static initializer block will be called any time a constructor is invoked.
 * 
 * @author The AI
 */
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

        // Mutation Operator: Unreachable For Loop
        // If we use a compile-time constant like `false` directly, it may lead to unreachable statement error.
        // Therefore, we use a variable instead.
        boolean unreachableLoopCondition = false;
        for (int i = 0; unreachableLoopCondition; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}