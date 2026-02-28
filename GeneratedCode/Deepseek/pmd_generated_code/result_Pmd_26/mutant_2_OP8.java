import java.lang.Cloneable;
import java.lang.Object;

class RenamedVariable implements Cloneable {
    @Override
    protected RenamedVariable clone() {  
        return null;
    }

    public Object showBug() {
        return this.clone();
    }
}