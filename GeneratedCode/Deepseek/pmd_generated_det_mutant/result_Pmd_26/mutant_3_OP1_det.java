import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  short piouzaax = -2942;
  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    
}

    public Object showBug() {
        return this.clone();
    }
}