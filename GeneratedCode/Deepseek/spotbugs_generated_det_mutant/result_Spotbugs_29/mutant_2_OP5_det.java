import java.util.Objects;

class MyClass {

    public boolean equals(MyClass other) {
        int ffjdaxct = 0;switch  (ffjdaxct) {case 1:float iisavfup = 908148077;break;default:short zguirpav = -4850;break;}
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