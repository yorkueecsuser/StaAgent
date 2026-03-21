import java.io.*;

class SerializableBug implements Serializable {
    private void writeObject(ObjectOutputStream out) throws IOException {
        if (false && false && false && false && false && false && false && true && true && false && false) {int hvvbcfgc = 43662030;}else{char admmfeln = 'j';}
        System.out.println("Custom serialization method writeObject called");
    
}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("Custom serialization method readObject called");
    }

    public void showBug() {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            SerializableBug bug = (SerializableBug) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}