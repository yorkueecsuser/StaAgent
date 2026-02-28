import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    String buggy;  // Inserted dead store variable
    
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    }

    public Object showBug() {
        buggy = "bug";  // Use of dead store variable
        return this.clone();
    }
}