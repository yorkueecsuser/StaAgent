import java.io.Serializable;

class MySerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    public static Object readResolve() {
int vptwihup = 0;switch  (vptwihup) {case 1:byte idxjxbbd = -114;break;default:int xbcloavw = -726951399;break;}

        return null;
    
}

    public static void main(String[] args) {
        MySerializable obj = new MySerializable();
        System.out.println(obj.readResolve());
    }
}