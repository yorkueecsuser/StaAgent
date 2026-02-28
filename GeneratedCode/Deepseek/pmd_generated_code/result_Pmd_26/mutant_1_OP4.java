import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        return null;
    }

    public Object showBug() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // Some unreachable code
        } else {
            return this.clone();
        }
        return null; // This line is to avoid compile-time error
    }
}