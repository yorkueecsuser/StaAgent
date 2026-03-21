class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        if (false && false && true && false && true && true && false && true && true && true && false) {int vrnfovmq = -867563151;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}