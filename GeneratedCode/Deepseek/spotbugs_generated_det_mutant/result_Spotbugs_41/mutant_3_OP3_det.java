import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (true && false && false && false && false && false && true && false && true && false && false) {double zfquxtjj = -838737926;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}