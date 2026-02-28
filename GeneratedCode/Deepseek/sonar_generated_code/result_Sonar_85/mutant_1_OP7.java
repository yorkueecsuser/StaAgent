class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; 
        char c = myString.charAt(index);
        return c; 

        int mutantIndex = 0;
        boolean mutantCondition = (10 == 11); // Unreachable while loop
        while(mutantCondition) { // This loop will never be executed due to false condition
            mutantIndex++;
        }
    }
}