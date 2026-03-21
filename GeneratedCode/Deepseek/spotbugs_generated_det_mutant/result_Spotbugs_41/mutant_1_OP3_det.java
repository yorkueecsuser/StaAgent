import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (false && false && true && false && false && false && true && true && false && true && false) {int zejfvgmk = -403878551;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}