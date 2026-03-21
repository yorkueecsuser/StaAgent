import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        for  (int dqdmtklp = 0; dqdmtklp < 0; dqdmtklp++) {long fqrogkhl = 904909847;}
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}