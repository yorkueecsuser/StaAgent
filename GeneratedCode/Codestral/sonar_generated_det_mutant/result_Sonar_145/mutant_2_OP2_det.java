class ArrayBug {
public String showBug(int [] array){
    String result = array.toString();
    result = array.toString();
    return result;
}
}