import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    }

    public Object showBug() {
        return this.clone();
    }

    public void unreachableForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}