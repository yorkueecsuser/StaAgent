import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {
        int a = 10;
        switch(a) {
            case 1:
                break;
            default:
                break;
        }
        return null;
    }

    public Object showBug() {
        return this.clone();
    }
}