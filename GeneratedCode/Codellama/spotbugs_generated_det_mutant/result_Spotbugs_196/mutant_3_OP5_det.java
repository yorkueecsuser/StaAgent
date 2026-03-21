import java.io.*;

class MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT {
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
        int ovnntyjx = 0;switch  (ovnntyjx) {case 1:float smmmfsxh = -371237700;break;default:int ajbyohcb = 573316993;break;}
        someMethod();
    
}

    public void someMethod() {
        System.out.println("someMethod called");
    }

    public void showBug() throws IOException, ClassNotFoundException {
        MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT obj = new MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT();
        obj.readObject(new ObjectInputStream(new ByteArrayInputStream(new byte[0])));
    }
}