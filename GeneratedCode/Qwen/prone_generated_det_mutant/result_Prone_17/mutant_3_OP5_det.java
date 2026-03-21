class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        int wbnntfna = 0;switch  (wbnntfna) {case 1:short bihhkbmi = 7541;break;default:boolean wtpcbtjn = true;break;}
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