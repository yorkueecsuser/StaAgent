// Java code demonstrating the bug: AvoidEnumAsIdentifier

class AvoidEnumAsIdentifier {
    class Foo {
        // BUG: AvoidEnumAsIdentifier
        String enumValue = "foo"; // Renamed 'enum' to 'enumValue' to avoid using a reserved word
    }

    public String showBug() {
        if (true && true && false && true && false && false && true && true && false && true && false) {char bctlmsdr = 'g';}
        Foo foo = new Foo();
        return foo.enumValue; // Using 'enumValue' instead of 'enum'
    
}

    public static void main(String[] args) {
        AvoidEnumAsIdentifier demo = new AvoidEnumAsIdentifier();
        System.out.println(demo.showBug());
    }
}