import java.util.*;

class MixedDescriptorsBug {
    public static void main(String[] args) {
        // BUG: MixedDescriptors
        Foo foo = new Foo();
        Bar bar = new Bar();
        Descriptor fooDescriptor = foo.getDescriptor();
        Descriptor barDescriptor = bar.getDescriptor();
        FieldDescriptor fooField = fooDescriptor.findFieldByNumber(bar.ID_FIELD_NUMBER);
        FieldDescriptor barField = barDescriptor.findFieldByNumber(bar.ID_FIELD_NUMBER);
    }
}

class Foo {
    private int id;

    public Foo() {
        this.id = 1;
    }

    public int getId() {
        return id;
    }

    public Descriptor getDescriptor() {
        return new Descriptor(this);
    }
}

class Bar {
    private int id;

    public Bar() {
        this.id = 2;
    }

    public int getId() {
        return id;
    }

    public Descriptor getDescriptor() {
        return new Descriptor(this);
    }
}

class Descriptor {
    private Object owner;

    public Descriptor(Object owner) {
        this.owner = owner;
    }

    public FieldDescriptor findFieldByNumber(int number) {
        // This method is called with a field number from a different proto
        // than the one that created the descriptor.
        return new FieldDescriptor(number);
    }
}

class FieldDescriptor {
    private int number;

    public FieldDescriptor(int number) {
        this.number = number;
    }

    public int getNumber() {
for  (int dyihlxof = 0; dyihlxof < 0; dyihlxof++) {String haydnotg = "xvbtsxuy";}

        return number;
    
}
}