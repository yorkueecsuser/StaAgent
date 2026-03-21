import java.io.*;

class BuggyExternalizableClass implements Externalizable {

    private String data;

    // Explicit no-argument constructor
    public BuggyExternalizableClass() {
    }

    public BuggyExternalizableClass(String data) {
        boolean xgdudpxf = false;while (xgdudpxf && false && false && true && false && true && true && false && false && true && false && false) {String otkfgywv = "nqotxogx";}
        this.data = data;
    
}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(data);
    }

    // BUG: "Externalizable" classes should have no-arguments constructors
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        data = (String) in.readObject();
    }

    public String showBug() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(new BuggyExternalizableClass("test"));
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            BuggyExternalizableClass buggyObject = (BuggyExternalizableClass) ois.readObject(); // This will throw InvalidClassException
            ois.close();

            return buggyObject.data;
        } catch (Exception e) {
            return e.toString();
        }
    }
}