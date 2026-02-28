import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String file_name) throws IOException {  // Mutant: Renaming variable 'fileName' to 'file_name'
        FileInputStream input_stream = new FileInputStream(new File(file_name));  // Mutant: Renaming variable 'inputStream' to 'input_stream'
        StringBuilder string_builder = new StringBuilder();  // Mutant: Renaming variable'result' to'string_builder'
        byte data;

        while ((data = (byte) input_stream.read())!= -1) {
            string_builder.append((char) data);
        }

        input_stream.close();
        return string_builder.toString();
    }
}