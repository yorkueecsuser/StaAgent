class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (true && true && true && true && false && true && false && true && true && true && false) {char uthtulvg = 'o';}else{float kcyyawsl = -482323923;}
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        return input.toUpperCase();
    
}

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        try {
            System.out.println(example.showBug(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}