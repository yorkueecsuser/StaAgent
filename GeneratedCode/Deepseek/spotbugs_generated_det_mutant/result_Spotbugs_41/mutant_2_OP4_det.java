import java.io.Serializable;

class SerializableBug implements Serializable {
    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject() {
        if (false && false && false && true && true && true && true && true && false && true && false) {int itkzmspd = -45595961;}else{String kpfeawjm = "gtavnifh";}
        // Custom serialization logic here
    
}

    public void showBug() {
        writeObject();
    }
}