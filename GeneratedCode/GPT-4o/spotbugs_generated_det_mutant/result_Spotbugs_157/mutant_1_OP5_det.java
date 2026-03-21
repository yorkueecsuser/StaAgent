class ParentClass {
    public static void display() {
        System.out.println("Displaying from ParentClass");
    }
}

class ChildClass extends ParentClass {
    public static void display() { // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        int gzbdngjk = 0;switch  (gzbdngjk) {case 1:byte girznyov = -114;break;default:byte otzhmkhw = 39;break;}
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