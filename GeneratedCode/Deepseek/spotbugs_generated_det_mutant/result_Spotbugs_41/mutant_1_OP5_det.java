import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        int pomckdor = 0;switch  (pomckdor) {case 1:long zoqeruij = 154039932;break;default:int unzrsncg = 813733336;break;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}