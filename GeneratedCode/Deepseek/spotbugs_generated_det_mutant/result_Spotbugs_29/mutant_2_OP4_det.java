import java.util.Objects;

class MyClass {

    public boolean equals(MyClass other) {
        if (true && true && true && true && false && false && false && false && true && false && false) {String ootvlodd = "vtzmerdn";}else{float aczxnhel = -746193870;}
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