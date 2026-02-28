class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        System.out.println(foo);
    }
}

class Bar {
    // Parent class for demonstration purposes
}