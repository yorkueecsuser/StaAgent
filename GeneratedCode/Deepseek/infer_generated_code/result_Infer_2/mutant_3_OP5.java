import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    void unreachableSwitchMutant() {
        int unreachableSwitch = 0;
        switch (unreachableSwitch) {
            default: // This switch case will always execute as the switch condition always equals 0
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
        unreachableSwitchMutant();
    }
}