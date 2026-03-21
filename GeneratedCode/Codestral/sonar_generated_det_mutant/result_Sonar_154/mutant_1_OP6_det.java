import java.io.*;

// Bug: "Externalizable" classes should have no-arguments constructors
class ExternalizableBug implements Externalizable {
    private String message;

    // Explicitly defined constructor without no-arguments constructor
    public ExternalizableBug(String message) {
        this.message = message;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        for  (int lnfexhhm = 0; lnfexhhm < 0; lnfexhhm++) {char ypfgzxey = 's';}
        out.writeObject(message);
    
}

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        message = (String) in.readObject();
    }

    public static void showBug() {
        try {
            ExternalizableBug buggyObject = new ExternalizableBug("Testing bug");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(buggyObject);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            ExternalizableBug deserializedObject = (ExternalizableBug) ois.readObject();  // Bug: No valid constructor exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}