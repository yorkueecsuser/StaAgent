import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        return null;
    }

    public Object showBug() {
        int condition = 0;
        while (condition < 0) {
            // Unreachable code
            condition++;
        }
        return this.clone();
    }
}