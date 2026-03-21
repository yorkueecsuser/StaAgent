import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        for  (int pbtkmzgg = 0; pbtkmzgg < 0; pbtkmzgg++) {short rhdxpyrm = -5346;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}