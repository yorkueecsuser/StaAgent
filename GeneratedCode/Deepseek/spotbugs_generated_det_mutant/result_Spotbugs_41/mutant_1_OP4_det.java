import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (true && true && true && false && false && true && true && false && false && true && false) {String zanjruee = "bjtpeoyn";}else{double wafiyfph = -771390631;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}