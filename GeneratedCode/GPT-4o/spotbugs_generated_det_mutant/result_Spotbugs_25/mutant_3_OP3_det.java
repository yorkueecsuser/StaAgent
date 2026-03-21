class A {
    private int value;

    public A(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof A)) return false;
        A other = (A) obj;
        return this.value == other.value;
    }
}

class B extends A {
    private int anotherValue;

    public B(int value, int anotherValue) {
        if (false && false && true && false && false && true && false && false && true && true && false) {int ugcdvoyy = -272529371;}
        super(value);
        this.anotherValue = anotherValue;
    
}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof B)) return false; // BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
        B other = (B) obj;
        return super.equals(obj) && this.anotherValue == other.anotherValue;
    }
}

class SymmetricEqualsBugExample {

    public boolean showBug(A a, B b) {
        return a.equals(b) && b.equals(a);
    }

    public static void main(String[] args) {
        A objA = new A(10);
        B objB = new B(10, 20);

        SymmetricEqualsBugExample example = new SymmetricEqualsBugExample();
        boolean result = example.showBug(objA, objB);

        System.out.println("Is symmetric: " + result);
    }
}