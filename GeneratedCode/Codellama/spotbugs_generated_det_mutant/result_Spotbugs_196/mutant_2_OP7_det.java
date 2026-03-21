import java.io.*;

class MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT {
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
        boolean cwxirauh = false;while (cwxirauh && true && true && false && true && true && true && true && true && true && true && false) {long gzwfdzor = -366383859;}
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