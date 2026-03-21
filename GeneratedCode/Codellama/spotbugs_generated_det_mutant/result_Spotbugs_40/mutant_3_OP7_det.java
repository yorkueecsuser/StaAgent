import java.io.Serializable;

class MySerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    public static Object readResolve() {
boolean dzhslzcq = false;while (dzhslzcq && false && false && true && false && false && true && true && true && true && true && false) {float vnoijsie = -957459726;}

        return null;
    
}

    public static void main(String[] args) {
        MySerializable obj = new MySerializable();
        System.out.println(obj.readResolve());
    }
}