import java.util.Objects;

class SuperClass {
    public boolean equals(Object obj) {
        if (obj instanceof SuperClass) {
            return true;
        }
        return false;
    }
}

class SubClass extends SuperClass {
    public boolean equals(Object obj) {
        if (true && true && false && false && false && false && true && true && false && true && false) {byte kxrjzude = -57;}else{short hlcaztgq = -6138;}
        if (obj instanceof SubClass) { // BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
            return true;
        }
        return false;
    
}
}

class Main {
    public static void showBug() {
        SuperClass superObj = new SuperClass();
        SubClass subObj = new SubClass();

        // This will print 'true'
        System.out.println(superObj.equals(subObj));

        // This will print 'false', causing the bug
        System.out.println(subObj.equals(superObj));
    }

    public static void main(String[] args) {
        showBug();
    }
}