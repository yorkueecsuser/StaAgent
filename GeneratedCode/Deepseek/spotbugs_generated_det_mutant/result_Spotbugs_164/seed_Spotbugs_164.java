import java.io.File;

class RelativePathTraversal {
    public void showBug(String fileName) {
        File file = new File(fileName);
        // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    }
}