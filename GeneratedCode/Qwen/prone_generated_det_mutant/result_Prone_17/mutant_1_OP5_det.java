class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        int viuzfhgx = 0;switch  (viuzfhgx) {case 1:short krjupawi = -8234;break;default:float vyelsegf = -714165460;break;}
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