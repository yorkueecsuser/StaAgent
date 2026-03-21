class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        if (true && true && false && false && false && true && false && false && false && false && false) {char xhpgyzke = 'n';}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}