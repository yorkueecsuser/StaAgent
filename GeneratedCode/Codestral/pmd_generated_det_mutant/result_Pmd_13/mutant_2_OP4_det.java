class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        if (false && true && true && true && false && true && true && true && false && false && false) {boolean edonquoj = false;}else{int hxnpsdcv = 301933985;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}