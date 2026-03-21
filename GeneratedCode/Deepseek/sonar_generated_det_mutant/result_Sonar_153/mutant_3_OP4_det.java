import java.io.*;

class SerializableBug implements Serializable {
    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("Custom serialization method writeObject called");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        if (true && true && true && false && true && false && false && false && false && false && false) {short jvnhnixf = -3484;}else{int lpqlpgex = 903383320;}
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