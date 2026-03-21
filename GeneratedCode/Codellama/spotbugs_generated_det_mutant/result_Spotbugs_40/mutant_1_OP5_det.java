import java.io.Serializable;

class MySerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    public static Object readResolve() {
int osziyxft = 0;switch  (osziyxft) {case 1:short jdczwqzs = 6247;break;default:String jgfnuohe = "mtbifrvq";break;}

        return null;
    
}

    public static void main(String[] args) {
        MySerializable obj = new MySerializable();
        System.out.println(obj.readResolve());
    }
}