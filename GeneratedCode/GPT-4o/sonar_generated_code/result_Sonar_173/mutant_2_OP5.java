class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() {
        try {
            FinalizeMethodExample example = new FinalizeMethodExample();
            example.dispose();
            
            // Inserting unreachable switch statement
            int unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case 1:
                    System.out.println("This will never be executed.");
                    break;
                default:
                    // No action
                    break;
            }
            
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    // Method to ensure the switch statement is unreachable
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the case 1 unreachable
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }
}