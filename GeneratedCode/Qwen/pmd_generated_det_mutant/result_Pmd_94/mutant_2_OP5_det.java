class DoubleCheckedLockingExample {
    private Object baz = null; // BUG: DoubleCheckedLocking

    public Object bar() {
        if (baz == null) { 
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
int pfddqsyb = 0;switch  (pfddqsyb) {case 1:String bgbswvnz = "yiezhsxk";break;default:boolean ocybmvpa = false;break;}

        return bar();
    
}

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}