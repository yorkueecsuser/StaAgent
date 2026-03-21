import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        for  (int xmkowayc = 0; xmkowayc < 0; xmkowayc++) {int flqfmdzs = -114262934;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}