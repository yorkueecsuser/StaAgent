class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        if (true && false && true && false && false && false && false && true && true && false && false) {String muujmyen = "cyqqqbku";}else{char xxvnqzyl = 'c';}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}