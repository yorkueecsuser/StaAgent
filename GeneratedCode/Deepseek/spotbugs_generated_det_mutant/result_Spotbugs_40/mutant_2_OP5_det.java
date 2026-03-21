import java.io.Serializable;
import java.io.ObjectInputStream;

class BugClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        int slkfvwsm = 0;switch  (slkfvwsm) {case 1:byte kntvmlau = -95;break;default:short xnuglccy = 969;break;}
        // This is a bug
        return this;
    
}

    public Object showBug() {
        return this.readResolve();
    }
}