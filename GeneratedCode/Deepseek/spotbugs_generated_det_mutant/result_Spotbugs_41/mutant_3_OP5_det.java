import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        int ffwhipwe = 0;switch  (ffwhipwe) {case 1:byte lvclyxnj = 28;break;default:char qdpgqjgw = 'r';break;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}