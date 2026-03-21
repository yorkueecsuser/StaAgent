import java.lang.Thread;

class RunFinalizersOnExitExample {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int vrdvoclm = 0;switch  (vrdvoclm) {case 1:char xpoowhgg = 'z';break;default:short paugqmcs = -4094;break;}
        System.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    
}

    protected void finalize() {
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}