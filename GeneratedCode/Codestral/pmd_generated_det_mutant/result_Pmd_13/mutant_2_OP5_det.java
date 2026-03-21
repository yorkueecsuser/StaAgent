class Foo extends Bar {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    public void showBug() {
        int lpbwehwm = 0;switch  (lpbwehwm) {case 1:byte oorbwlpi = -25;break;default:char csydekws = 'f';break;}
        System.out.println(foo);
    
}
}

class Bar {
    // Parent class for demonstration purposes
}