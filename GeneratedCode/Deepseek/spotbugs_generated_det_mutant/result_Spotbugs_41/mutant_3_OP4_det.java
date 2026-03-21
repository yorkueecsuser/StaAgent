import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (true && false && true && false && true && true && true && false && true && false && false) {long dorskkbz = 916531585;}else{byte pgzozlbu = -3;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}