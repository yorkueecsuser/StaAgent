class MyClass {

    public Object clone() throws CloneNotSupportedException {
int bzagthbv = 0;switch  (bzagthbv) {case 1:byte rfubrzwh = 58;break;default:long ttmdkprx = 283862562;break;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}