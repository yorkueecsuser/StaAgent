class AvoidAssertExample {
    
    class Foo {
        String assert = "foo"; // BUG: AvoidAssertAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.assert; // Accessing the member renamed 'assertIdentifier'
    }

    public static void main(String[] args) {
        AvoidAssertExample example = new AvoidAssertExample();
        String result = example.showBug();
        System.out.println("Result: " + result);
    }
}