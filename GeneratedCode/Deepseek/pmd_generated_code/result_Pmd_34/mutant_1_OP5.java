// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    public void mutantMethod() {
        int value = getValue();
        // Unreachable switch statement mutant
        switch(value) {
            case 1:
                System.out.println("Unreachable mutant");
                break;
            default:
                break;
        }
    }

    private int getValue() {
        return 0; // Value that will always make the switch statement unreachable
    }
}