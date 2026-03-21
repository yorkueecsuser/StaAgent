import java.io.Serializable;

class MySerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    public static Object readResolve() {
if (false && true && false && true && true && true && false && false && false && false && false) {int kgjxukxt = -930679791;}else{String vzgrkseh = "hhcntkrq";}

        return null;
    
}

    public static void main(String[] args) {
        MySerializable obj = new MySerializable();
        System.out.println(obj.readResolve());
    }
}