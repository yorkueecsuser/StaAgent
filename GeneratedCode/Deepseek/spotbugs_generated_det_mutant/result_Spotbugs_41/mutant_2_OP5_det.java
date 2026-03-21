import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        int chschtwe = 0;switch  (chschtwe) {case 1:String vxgfjqvp = "ztzwyloc";break;default:short izncywew = -8272;break;}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}