class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        double lvsatykd = -373077455;
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}