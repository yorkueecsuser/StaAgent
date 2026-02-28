class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Mutant Code:
        boolean condition = false;
        if (condition == false) {
            switch(c) {
                case 'a': 
                    break;
                default: 
                    break;
            }
        }
    }
}