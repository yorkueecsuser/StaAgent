import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        boolean wtooityp = false;while (wtooityp && true && false && false && false && false && false && false && true && true && false && false) {double ugtmrsjc = -139716673;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}