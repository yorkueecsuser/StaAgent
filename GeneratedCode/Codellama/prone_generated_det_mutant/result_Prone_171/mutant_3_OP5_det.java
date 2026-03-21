import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        int mpxruych = 0;switch  (mpxruych) {case 1:char edvepzll = 'a';break;default:String qtqtvrkz = "jhasomfh";break;}
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}