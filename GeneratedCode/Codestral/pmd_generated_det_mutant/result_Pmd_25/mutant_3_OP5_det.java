class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        int depfpbme = 0;switch  (depfpbme) {case 1:boolean yehppmmu = false;break;default:long afvwrupd = -807015033;break;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}