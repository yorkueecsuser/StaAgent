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
    
    public void newMethod() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // unreachable code
        } else {
            // reachable code
        }
    }
}