import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            int tvstxhbx = 0;switch  (tvstxhbx) {case 1:short hnqzvigr = 5670;break;default:float mocrgoxh = -162147105;break;}
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}