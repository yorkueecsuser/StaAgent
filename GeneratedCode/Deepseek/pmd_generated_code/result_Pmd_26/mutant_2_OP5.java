import java.lang.Cloneable;
import java.lang.Object;

class CloneMethodReturnTypeMustMatchClassName implements Cloneable {
    @Override
    protected CloneMethodReturnTypeMustMatchClassName clone() {  // BUG: CloneMethodReturnTypeMustMatchClassName
        int x = 0;
        switch (x) {
            case 0:
                System.out.println("Unreachable switch statement");
            default:
                break;
        }
        return null;
    }

    public Object showBug() {
        return this.clone();
    }
}