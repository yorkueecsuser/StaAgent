import java.util.Objects;

class MyClass {

    public boolean equals(MyClass other) {
        int rzeudrgx = 0;switch  (rzeudrgx) {case 1:String hjorbzqm = "ycqgmcfl";break;default:char vrqgsbje = 'c';break;}
        if (other == null) {
            return false;
        }
        return Objects.equals(this, other);  // BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
    
}

    public boolean showBug() {
        MyClass myObject = new MyClass();
        MyClass otherObject = new MyClass();
        return myObject.equals(otherObject);
    }
}