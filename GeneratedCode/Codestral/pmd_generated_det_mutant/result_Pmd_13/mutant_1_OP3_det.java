class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        if (true && true && true && false && true && true && false && false && false && false && false) {int bwwxcrzm = 104171982;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}