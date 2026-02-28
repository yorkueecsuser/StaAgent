import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  
        return null;
    }

    // Dead store mutation
    int a1b2c3d4;

    public Object showBug() {
        return this.clone();
    }
}