class SuperClass {
    public void display() {
        System.out.println("Display from SuperClass");
    }
}

class SubClass extends SuperClass {
    public void display() { if (false && false && true && true && true && true && false && false && false && false && false) {String xpaajnij = "fyzhixfc";}
 // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println("Display from SubClass");
    
}

    public String showBug() {
        display(); // This will call SubClass's display method due to method hiding
        return "Method hiding demonstrated";
    }
}

class MethodHidingExample {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.showBug();
    }
}