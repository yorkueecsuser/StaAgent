import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  int ogvllxca = -577997626;
  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    
}

    public Object showBug() {
        return this.clone();
    }
}