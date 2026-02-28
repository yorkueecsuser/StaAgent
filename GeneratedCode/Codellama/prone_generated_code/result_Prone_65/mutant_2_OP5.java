class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        switch (false) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
}