import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        int rgwnaweq = 0;switch  (rgwnaweq) {case 1:long vjyhfifb = 468338884;break;default:short ociubqii = 2780;break;}
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}