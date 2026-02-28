import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    private boolean condition;

    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    }

    public Object showBug() {
        if (condition) {
            if (false) { // mutant (unreachable if-else statement)
                return this.clone();
            }
            return null;
        } else {
            return this.clone();
        }
    }
}