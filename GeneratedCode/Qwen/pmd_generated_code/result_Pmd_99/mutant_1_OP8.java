class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString
        return result;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
        
        // Mutated code
        String x = "" + number; // Renamed'result' to 'x'
        return x;
    }
}