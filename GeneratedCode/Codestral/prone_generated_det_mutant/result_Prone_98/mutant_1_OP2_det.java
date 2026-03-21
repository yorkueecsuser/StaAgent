class LenientFormatStringValidationBug {
public String showBug(String name){
    String formattedString = String.format("Hello, %s!" , name , "Extra argument");
    formattedString = String.format("Hello, %s!" , name , "Extra argument");
    return formattedString;
}
}