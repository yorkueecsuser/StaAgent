class NullDereferenceBug {
    private String buggyString;

    public void setBuggyString(String buggyString) {
        this.buggyString = buggyString;
    }

    public void showBug() {
        // Added unreachable switch statement to make the code mutated
        int randomNum = (int) (Math.random() * 10);
        switch (randomNum > 10) {
            case true:
                System.out.println("This line is unreachable due to the false condition.");
                break;
        }

        // Buggy line: We're assuming that buggyString is never null, but it might be.
        System.out.println(buggyString.length()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }

    public static void main(String[] args) {
        NullDereferenceBug bug = new NullDereferenceBug();
        // For demonstration purposes, we're not setting buggyString.
        // In a real-world scenario, this might happen due to a programming error or a race condition.
        bug.showBug();
    }
}