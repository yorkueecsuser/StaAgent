import java.util.Objects;

class UnnecessaryCheckNotNull {
public static void main(String [] args){
    String input = args [ 0 ];
    input = args [ 0 ];
    if(Objects.nonNull(input)) { System.out.println("The input is not null"); }
}
}