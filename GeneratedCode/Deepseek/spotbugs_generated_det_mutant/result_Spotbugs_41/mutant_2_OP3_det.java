import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (false && true && true && true && false && false && true && true && true && true && false) {double yabjltlk = 104910315;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}