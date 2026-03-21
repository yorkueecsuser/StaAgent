import java.io.File;

class RelativePathTraversal {
public void showBug(String fileName){
    File file = new File(fileName);
    file = new File(fileName);
}
}