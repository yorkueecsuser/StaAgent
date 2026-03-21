class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        for  (int svczqrxv = 0; svczqrxv < 0; svczqrxv++) {boolean izjqegnp = false;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}