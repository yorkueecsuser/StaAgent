import java.io.Serializable;
import java.io.ObjectInputStream;

class BugClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        float podivkcd = 917502426;
        // This is a bug
        return this;
    
}

    public Object showBug() {
        return this.readResolve();
    }
}