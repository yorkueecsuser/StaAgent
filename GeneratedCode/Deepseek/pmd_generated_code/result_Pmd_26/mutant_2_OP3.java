import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        // Mutant: Incorrect return type of clone method
        return new Object();
    }

    public Object showBug() {
        return this.clone();
    }
}