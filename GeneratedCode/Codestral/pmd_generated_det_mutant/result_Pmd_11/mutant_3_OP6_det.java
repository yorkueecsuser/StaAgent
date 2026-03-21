// Java code demonstrating the bug: AvoidEnumAsIdentifier

class AvoidEnumAsIdentifier {
    class Foo {
        // BUG: AvoidEnumAsIdentifier
        String enumValue = "foo"; // Renamed 'enum' to 'enumValue' to avoid using a reserved word
    }

    public String showBug() {
        for  (int mtvnrwyo = 0; mtvnrwyo < 0; mtvnrwyo++) {float oyljtxwg = -203012089;}
        Foo foo = new Foo();
        return foo.enumValue; // Using 'enumValue' instead of 'enum'
    
}

    public static void main(String[] args) {
        AvoidEnumAsIdentifier demo = new AvoidEnumAsIdentifier();
        System.out.println(demo.showBug());
    }
}