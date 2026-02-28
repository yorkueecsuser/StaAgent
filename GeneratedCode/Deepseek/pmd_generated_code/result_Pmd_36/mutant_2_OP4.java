class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        boolean shouldTerminate = false; // new, non-final variable
        if(shouldTerminate){ // if statement condition is non-final and dynamically determined at runtime
            System.exit(0); // this branch will never be reached, hence unreachable
        }
        System.out.println("This code will always be executed");
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}