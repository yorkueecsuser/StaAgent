import java.util.Random;

class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");

        // Dead Store Mutation: Inserted unused variable declaration
        int deadStoreVariable = new Random().nextInt(100);
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}