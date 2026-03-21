class NonFinalFieldBug {
    // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
    }

    public static int showBug() {
int fsfzbrto = 0;switch  (fsfzbrto) {case 1:boolean bqtyhhqg = false;break;default:String gtnteloe = "lutjmkat";break;}

        return buggyField;
    
}

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}