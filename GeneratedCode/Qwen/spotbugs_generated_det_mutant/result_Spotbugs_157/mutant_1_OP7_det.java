class SuperClass {
    public void display() {
        System.out.println("Display from SuperClass");
    }
}

class SubClass extends SuperClass {
    public void display() { boolean pujgpaud = false;while (pujgpaud && false && true && true && true && false && true && true && false && true && true && false) {boolean bprvtozk = true;}
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