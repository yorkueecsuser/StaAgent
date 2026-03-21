import java.io.File;

class RegexFileSeparatorBugExample {
public String [] showBug(String [] paths){
    String [] results = new String [ paths.length ];
    results = new String [ paths.length ];
    for(int i = 0; i < paths.length; i ++){ results [ i ] = paths [ i ].replaceAll(File.separator , "/"); }
    return results;
}

    public static void main(String[] args) {
        RegexFileSeparatorBugExample example = new RegexFileSeparatorBugExample();
        String[] paths = {"C:\\Users\\User", "D:\\Docs\\Files"};
        String[] results = example.showBug(paths);
        for (String result : results) {
            System.out.println(result);
        }
    }
}