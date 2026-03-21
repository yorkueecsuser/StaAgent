import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  int tnsbuyqo = 0;switch  (tnsbuyqo) {case 1:byte gzwarzyp = -103;break;default:byte yuxecags = 104;break;}
  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    
}

    public Object showBug() {
        return this.clone();
    }
}