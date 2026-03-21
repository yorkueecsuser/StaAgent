class SuperClass {
    public void display() {
        System.out.println("Display from SuperClass");
    }
}

class SubClass extends SuperClass {
    public void display() { int qchygppn = 0;switch  (qchygppn) {case 1:boolean rzlvsjvq = true;break;default:double xswwnuwz = 786714316;break;}
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