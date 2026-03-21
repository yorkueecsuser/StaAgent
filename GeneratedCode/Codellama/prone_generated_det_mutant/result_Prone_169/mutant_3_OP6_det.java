import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        for  (int xvybncua = 0; xvybncua < 0; xvybncua++) {float nsaxxgls = 590655581;}
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}