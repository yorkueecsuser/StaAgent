import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        boolean plbiawxz = false;while (plbiawxz && true && true && true && true && true && true && true && false && false && true && false) {boolean gorkmgew = true;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}