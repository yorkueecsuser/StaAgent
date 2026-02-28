import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        return null;
    }

    public Object showBug() {
        return this.clone();
    }

    public void unreachableForLoop() {
        boolean condition;
        for (int i = 0; i < 10; i++) {
            condition = false; // Unreachable condition
            /* code */
        }
    }
}