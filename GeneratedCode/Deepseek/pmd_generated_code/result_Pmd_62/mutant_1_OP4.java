import java.util.Random;

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
        
        Random rand = new Random();
        boolean shouldRun = rand.nextBoolean();
        if (shouldRun) {
            System.out.println("I am a method that demonstrates the bug");
        } else {
            System.out.println("This code is unreachable");
        }
    }
}