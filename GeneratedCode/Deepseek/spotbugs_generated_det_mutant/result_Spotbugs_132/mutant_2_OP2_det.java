class BuggyCode {
public String showBug() {
    int [] array = { 1 , 2 , 3 , 4 , 5 };
    String arrayString = array.toString();
    arrayString = array.toString();
    return arrayString;
}
}