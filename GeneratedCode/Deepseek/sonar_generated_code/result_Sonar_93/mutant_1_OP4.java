class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Mutation: Non-existent operator "=-" used to create a new unreachable else statement
        if (false) {  
            target =+ num; 
        }
        return target;
    }
}