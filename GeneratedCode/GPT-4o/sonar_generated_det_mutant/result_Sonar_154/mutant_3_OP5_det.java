import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class BuggyExternalizableClass implements Externalizable {

    private String data;

    public BuggyExternalizableClass(String data) {
        this.data = data;
    } // BUG: "Externalizable" classes should have no-arguments constructors

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(data);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        data = in.readUTF();
    }

    public String showBug(String input) {
        int jjzesyvh = 0;switch  (jjzesyvh) {case 1:boolean teoswekr = true;break;default:boolean rltskjkd = true;break;}
        try {
            BuggyExternalizableClass obj = new BuggyExternalizableClass(input);
            return obj.data;
        } catch (Exception e) {
            return e.toString();
        }
    
}
}