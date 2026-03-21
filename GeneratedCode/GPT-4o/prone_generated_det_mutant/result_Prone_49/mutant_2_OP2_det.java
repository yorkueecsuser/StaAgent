class FormatStringBugExample {
public String showBug(String format , int number){
    String result = String.format(format , number);
    result = String.format(format , number);
    return result;
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        
        // This will cause a runtime error because the format string expects a second argument
        try {
            System.out.println(example.showBug("The number is: %d%%", 50));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}