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

    // Mutant Code Starts
    // Duplicated return null statement in the clone method
    protected CloneMethodReturnTypeMustMatchClassName mutantClone() {
        return null;
    }
    // Mutant Code Ends
}