import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            int oggzcziv = 0;switch  (oggzcziv) {case 1:boolean juwpqzej = true;break;default:short epooswye = -981;break;}
            System.out.println("The input is not null");
        }
    
}
}