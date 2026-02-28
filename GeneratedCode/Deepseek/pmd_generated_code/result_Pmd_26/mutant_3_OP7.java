import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    }

    public Object showBug() {
        while (false) {
            // Unreachable code
            System.out.println("This is a unreachable while loop.");
        }
        return this.clone();
    }
}