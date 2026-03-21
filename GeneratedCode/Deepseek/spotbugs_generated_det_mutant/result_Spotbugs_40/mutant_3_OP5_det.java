import java.io.Serializable;
import java.io.ObjectInputStream;

class BugClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        int mzcuflxl = 0;switch  (mzcuflxl) {case 1:int tlwtudwk = 271376369;break;default:byte bixfwkvq = 37;break;}
        // This is a bug
        return this;
    
}

    public Object showBug() {
        return this.readResolve();
    }
}