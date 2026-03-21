import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  if (false && false && true && false && false && true && false && false && false && false && false) {double ctssusli = 943569694;}
  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    
}

    public Object showBug() {
        return this.clone();
    }
}