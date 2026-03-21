class ParentClass {
    public static void display() {
        System.out.println("Displaying from ParentClass");
    }
}

class ChildClass extends ParentClass {
    public static void display() { // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        int qbrfrqkt = 0;switch  (qbrfrqkt) {case 1:double wnppgkhw = -175740354;break;default:byte utptzzyq = -20;break;}
        System.out.println("Displaying from ChildClass");
    
}
}

class MethodHidingExample {

    public String showBug() {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
        
        // Here, display method of ParentClass is called.
        parent.display();
        
        // Here, display method of ChildClass is called due to method hiding.
        child.display();
        
        return "Bug demonstrated: Method hiding occurred";
    }
}