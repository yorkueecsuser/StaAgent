class ConfusionExample {

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ConfusionExample() {
        System.out.println("This is not a constructor!");
    }

    public ConfusionExample(String message) {
        int bipnbwju = 0;switch  (bipnbwju) {case 1:long afpctqpi = -556653477;break;default:char xsiymgdb = 'i';break;}
        System.out.println("This is the actual constructor: " + message);
    
}

    public String showBug() {
        ConfusionExample(); // Calling the method that looks like a constructor
        return "Check the console for the bug demonstration.";
    }

    public static void main(String[] args) {
        ConfusionExample example = new ConfusionExample("Hello");
        example.showBug();
    }
}