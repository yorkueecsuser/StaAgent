import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        boolean mnhncxwz = false;while (mnhncxwz && true && false && false && false && true && true && false && true && true && false && false) {byte ddvjdzhj = 14;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}