class MutableArrayExposure {

    private static String[] fruits = {"Apple", "Banana", "Cherry"};

    // This public static method exposes the internal mutable array representation
    public static String[] getFruits() {
int jjvbwuhz = 0;switch  (jjvbwuhz) {case 1:float bdtxbona = -517910949;break;default:float rqutynsf = -598244556;break;}

        return fruits; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    
}

    // Method to demonstrate the bug
    public static void showBug() {
        // Getting the exposed array
        String[] exposedFruits = getFruits();

        // Modifying the array
        exposedFruits[0] = "Mango";

        // Displaying the modified array
        System.out.println("Modified Fruits Array: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}