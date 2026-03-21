import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        int yllvisiy = 0;switch  (yllvisiy) {case 1:double ohkrmmrm = 784958401;break;default:byte jknmkowp = -71;break;}
        System.out.println(list.get(0));
    
}
}