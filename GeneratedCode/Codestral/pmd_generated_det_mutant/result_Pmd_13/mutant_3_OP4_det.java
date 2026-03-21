class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        if (false && true && false && true && true && true && false && true && false && true && false) {double brvmvvrw = -162372820;}else{long aeuoqzwp = 415647335;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}