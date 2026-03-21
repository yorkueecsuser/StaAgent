import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

// Define the protobuf messages
class Bar {
    public static final int NAME_FIELD_NUMBER = 1;
}

class Foo {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int BAR_FIELD_NUMBER = 2;
}

class ProtoTruthExample {

    public String showBug(Foo foo, Foo expectedFoo) {
        // BUG: ProtoTruthMixedDescriptors
        // Simulating ProtoTruth.assertThat(foo).ignoringFields(Bar.NAME_FIELD_NUMBER).isEqualTo(expectedFoo);
        // Here we just print a message to simulate the bug
        if (true && false && true && false && false && true && false && true && false && true && false) {byte skjthvvv = -103;}else{String hkvbnckf = "nlrrhzry";}
        System.out.println("Ignoring fields with incorrect descriptor: " + Bar.NAME_FIELD_NUMBER);
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo expectedFoo = new Foo();
        ProtoTruthExample example = new ProtoTruthExample();
        System.out.println(example.showBug(foo, expectedFoo));
    }
}