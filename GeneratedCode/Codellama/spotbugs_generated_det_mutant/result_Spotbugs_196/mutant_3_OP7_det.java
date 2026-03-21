import java.io.*;

class MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT {
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
        boolean etsdthht = false;while (etsdthht && true && true && false && false && true && true && false && true && true && false && false) {boolean pecrqtvo = true;}
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