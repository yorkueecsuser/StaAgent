class Foo {
    public boolean equals(Object other) {
        // do some comparison
        return (this == other);
    }

    public int hashCode() {
        // return some hash value
        return 42;
    }

    // BUG: OverrideBothEqualsAndHashcode
    public String toString() {
        return "This is a Foo object";
    }

    public void showBug() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        boolean condition = getCondition();
        if (getCondition()) {
            System.out.println(foo1.equals(foo2)); 
            System.out.println(foo1.hashCode() == foo2.hashCode()); 
        }
    }

    public boolean getCondition() {
        return false;
    }
}