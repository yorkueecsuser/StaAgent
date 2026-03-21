class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        int zhvduvxq = 0;switch  (zhvduvxq) {case 1:char kgwwthrx = 'n';break;default:long spbemtjd = -750430881;break;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}