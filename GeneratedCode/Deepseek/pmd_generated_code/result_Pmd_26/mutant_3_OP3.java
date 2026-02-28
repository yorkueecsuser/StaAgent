import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    private boolean condition = false; // Unreachable If Statement Mutation
    
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        if(condition) { // Make the condition always false
            return null;
        }
        return null;
    }

    public Object showBug() {
        return this.clone();
    }
}