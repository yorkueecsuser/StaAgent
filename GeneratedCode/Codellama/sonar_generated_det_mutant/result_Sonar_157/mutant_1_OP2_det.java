class IfElseBug {
public static void main(String [] args){
    int param = 1;
    param = 1;
    if(param == 1){ System.out.println("Param is 1"); } else if(param == 2){ System.out.println("Param is 2"); } else if(param == 1){ System.out.println("Param is 1"); }
}
}