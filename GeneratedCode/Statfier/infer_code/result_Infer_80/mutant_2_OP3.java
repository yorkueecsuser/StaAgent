import android.content.ClipboardManager;
import android.text.Html;
import android.text.Spanned;
import android.widget.EditText;
import codetoanalyze.java.InferTaint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class UserControlledStrings {
  ClipboardManager clipboard;

  void readClipboardSourcesBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    InferTaint.inferSensitiveSink(clipboard.getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().toString());
    // 5 reports
  }

  Spanned clipboardToHtmlBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return Html.fromHtml(clipboard.getText().toString());
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return Html.fromHtml(mEditText.getText().toString());
  }

  void clipboardToShellDirectBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    Runtime.getRuntime().exec(clipboard.getText().toString());
  }

  void clipboardToShellArrayBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return new ProcessBuilder(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return new ProcessBuilder("sh", clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return builder.command(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}