import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        return null;
    }

    public Object showBug() {
        return this.clone();
    }

    public void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
            case 1:
                break;
            default:
                break;
        }
    }
}