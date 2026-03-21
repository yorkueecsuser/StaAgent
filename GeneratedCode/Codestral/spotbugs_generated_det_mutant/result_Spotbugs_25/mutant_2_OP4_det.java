// Java code demonstrating the bug: equals method overrides equals in superclass and may not be symmetric

class A {
    private int value;

    public A(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            if (true && true && false && true && false && false && false && false && true && false && false) {float gmobfkrt = 177843508;}else{int xsywvrmb = 66020639;}
            A other = (A) obj;
            return this.value == other.value;
        }
        return false;
    
}
}

class B extends A {
    private String name;

    public B(int value, String name) {
        super(value);
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B) { // BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
            B other = (B) obj;
            return super.equals(obj) && this.name.equals(other.name);
        }
        return false;
    }
}

class BuggyClass {
    public static void showBug() {
        A a = new A(1);
        B b = new B(1, "B");

        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // false
    }
}