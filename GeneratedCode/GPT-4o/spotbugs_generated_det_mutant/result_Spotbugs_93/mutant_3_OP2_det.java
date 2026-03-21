class AnonymousClassBug {

    public interface Greeting {
        void greet();
    }
public void demonstrateBug() {
    Greeting greeting = new Greeting() { @ Override public void greet() { System.out.println("Hello!"); } public void uncallableMethod() { System.out.println("This method is never called!"); } };
    greeting = new Greeting() { @ Override public void greet() { System.out.println("Hello!"); } public void uncallableMethod() { System.out.println("This method is never called!"); } };
    greeting.greet();
}

    public void showBug() {
        demonstrateBug();
    }

    public static void main(String[] args) {
        AnonymousClassBug example = new AnonymousClassBug();
        example.showBug();
    }
}