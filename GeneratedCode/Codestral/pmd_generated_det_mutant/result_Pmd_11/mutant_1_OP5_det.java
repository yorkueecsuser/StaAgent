// Java code demonstrating the bug: AvoidEnumAsIdentifier

class AvoidEnumAsIdentifier {
    class Foo {
        // BUG: AvoidEnumAsIdentifier
        String enumValue = "foo"; // Renamed 'enum' to 'enumValue' to avoid using a reserved word
    }

    public String showBug() {
        int htbzflrm = 0;switch  (htbzflrm) {case 1:char nuttiigo = 'j';break;default:char jbekecnw = 'c';break;}
        Foo foo = new Foo();
        return foo.enumValue; // Using 'enumValue' instead of 'enum'
    
}

    public static void main(String[] args) {
        AvoidEnumAsIdentifier demo = new AvoidEnumAsIdentifier();
        System.out.println(demo.showBug());
    }
}