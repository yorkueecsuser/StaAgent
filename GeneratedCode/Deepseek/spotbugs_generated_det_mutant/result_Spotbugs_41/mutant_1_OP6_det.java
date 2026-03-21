import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        for  (int dncdrqno = 0; dncdrqno < 0; dncdrqno++) {int jghkkoks = -652731737;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}