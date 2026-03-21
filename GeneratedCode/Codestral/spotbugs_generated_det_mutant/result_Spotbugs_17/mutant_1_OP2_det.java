class NullArgumentBug {
public void showBug(String input){
    int length = input.length();
    length = input.length();
    System.out.println("Length of the input: " + length);
}
}