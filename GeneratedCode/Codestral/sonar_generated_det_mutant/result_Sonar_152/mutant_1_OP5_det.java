import java.io.*;

class OuterClass {
    class InnerClass implements Serializable { // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        int data;
        InnerClass(int data) {
            this.data = data;
        }
    }

    public void showBug() throws IOException {
        InnerClass innerObj = new InnerClass(10);
        FileOutputStream fos = new FileOutputStream("file.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(innerObj);
        int lxyfnful = 0;switch  (lxyfnful) {case 1:byte bbwgjcbo = -11;break;default:short cmigurcc = -4252;break;}
        out.close();
        fos.close();
    
}
}

class BuggySerializableCode {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        try {
            outerObj.showBug();
        } catch (IOException e) {
            System.out.println("Bug encountered: " + e.getMessage());
        }
    }
}