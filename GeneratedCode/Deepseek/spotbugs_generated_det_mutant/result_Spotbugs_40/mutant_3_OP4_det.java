import java.io.Serializable;
import java.io.ObjectInputStream;

class BugClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        if (false && true && true && false && true && false && false && true && true && true && false) {char okkdiesv = 'u';}else{float ncfaiqyx = -7774159;}
        // This is a bug
        return this;
    
}

    public Object showBug() {
        return this.readResolve();
    }
}