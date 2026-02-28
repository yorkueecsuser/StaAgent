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

    // newly added mutant code
    protected A cloneMethodReturnTypeMustMatchClassName() {
        return null;
    }
    
    public Object showMutant() {
        return this.cloneMethodReturnTypeMustMatchClassName();
    }
}