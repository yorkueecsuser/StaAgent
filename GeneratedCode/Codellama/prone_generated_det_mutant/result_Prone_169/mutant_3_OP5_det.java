import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        int yywyexxw = 0;switch  (yywyexxw) {case 1:char xtizjagu = 'b';break;default:char zxelxxkd = 'v';break;}
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}