class RegularExpressionBug {
public String showBug(String input){
    String output = input.replace("." , "|");
    output = input.replace("." , "|");
    return output;
}
}