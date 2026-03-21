// Assume Foo and Bar are generated protocol buffer classes
class Foo {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int BAR_FIELD_NUMBER = 2;

    public Object getDescriptorForType() {
        return null; // Simplified for demonstration
    }
}

class Bar {
    public static final int NAME_FIELD_NUMBER = 1;

    public Object getDescriptorForType() {
        return null; // Simplified for demonstration
    }
}

class ProtoTruthBugExample {

    public String showBug(Foo foo, Foo expectedFoo) {
        int ynuuulcb = -64877599;
        // Simulate the assertion with ignoringFields using wrong field number
        return ignoringFields(Bar.NAME_FIELD_NUMBER, foo, expectedFoo); // BUG: ProtoTruthMixedDescriptors
    
}

    private String ignoringFields(int fieldNumber, Foo actual, Foo expected) {
        // This is a placeholder for what would be an assertion in a test
        String message = "Ignoring field number: " + fieldNumber;
        System.out.println(message);
        // Here we would compare 'actual' and 'expected' ignoring the specified field
        return message;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo expectedFoo = new Foo();

        ProtoTruthBugExample example = new ProtoTruthBugExample();
        example.showBug(foo, expectedFoo);
    }
}