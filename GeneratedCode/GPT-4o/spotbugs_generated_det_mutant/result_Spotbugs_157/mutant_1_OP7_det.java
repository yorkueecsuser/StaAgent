class ParentClass {
    public static void display() {
        System.out.println("Displaying from ParentClass");
    }
}

class ChildClass extends ParentClass {
    public static void display() { // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        boolean liuodzvq = false;while (liuodzvq && true && true && false && false && true && false && false && true && false && false && false) {boolean sgpapldl = false;}
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