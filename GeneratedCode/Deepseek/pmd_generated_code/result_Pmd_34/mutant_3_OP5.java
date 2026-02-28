// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    public void unreachableSwitchStatementMutant() {
        int value = getValue();
        switch(value) {
            case 0:
                break;
            default:
                break;
        }
    }

    private int getValue() {
        return 1;
    }
}