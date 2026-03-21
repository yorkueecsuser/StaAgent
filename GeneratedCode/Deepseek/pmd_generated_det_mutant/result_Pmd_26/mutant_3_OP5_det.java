import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  int aolchfuk = 0;switch  (aolchfuk) {case 1:short vojblswf = 3169;break;default:int petcqxdw = 156941175;break;}
  // BUG: CloneMethodReturnTypeMustMatchClassName
        return null;
    
}

    public Object showBug() {
        return this.clone();
    }
}