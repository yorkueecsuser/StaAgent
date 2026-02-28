import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    }

    public CloneMethodReturnTypeMustMatchClassName cloneObject() {  // Mutation: Duplicated 'clone' method but with different method name
        return null;
    }

    public Object showBug() {
        return this.cloneObject();
    }
}