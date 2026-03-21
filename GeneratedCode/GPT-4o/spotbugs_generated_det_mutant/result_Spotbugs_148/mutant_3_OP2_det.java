class MissingWarningExample {

    public String mightReturnNull(boolean condition) {
        if (condition) {
            return null;
        } else {
            return "Not Null";
        }
    }
public String showBug(boolean condition){
    String result = mightReturnNull(condition);
    result = mightReturnNull(condition);
    return result.toUpperCase();
}
    
    public static void main(String[] args) {
        MissingWarningExample example = new MissingWarningExample();
        System.out.println(example.showBug(true)); // This could throw a NullPointerException
    }
}