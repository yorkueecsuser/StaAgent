class SuperClass {
    public void display() {
        System.out.println("Display from SuperClass");
    }
}

class SubClass extends SuperClass {
    public void display() { for  (int xxfpmaaf = 0; xxfpmaaf < 0; xxfpmaaf++) {int cbrdmuim = -553874162;}
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