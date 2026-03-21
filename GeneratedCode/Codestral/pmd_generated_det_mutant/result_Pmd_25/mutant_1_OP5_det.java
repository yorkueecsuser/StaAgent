class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        int epukopwl = 0;switch  (epukopwl) {case 1:long chctenox = -705528097;break;default:boolean sitrewoh = false;break;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}