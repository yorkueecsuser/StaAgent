import java.io.Serializable;

class MySerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    public static Object readResolve() {
boolean vpsecmwh = false;while (vpsecmwh && true && false && false && true && false && false && true && true && false && true && false) {String ivynqylf = "qghkkpcg";}

        return null;
    
}

    public static void main(String[] args) {
        MySerializable obj = new MySerializable();
        System.out.println(obj.readResolve());
    }
}