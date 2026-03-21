class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        boolean fnolawvk = false;while (fnolawvk && true && false && true && true && false && true && true && false && true && false && false) {double kqmzmrer = 596342618;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}