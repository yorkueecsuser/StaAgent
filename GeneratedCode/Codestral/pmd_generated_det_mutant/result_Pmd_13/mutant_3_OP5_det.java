class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        int pberomru = 0;switch  (pberomru) {case 1:double qefazsqv = 777112670;break;default:short slswyzqt = -8330;break;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}