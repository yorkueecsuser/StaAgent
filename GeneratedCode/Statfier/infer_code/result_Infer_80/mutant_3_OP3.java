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
      System.out.println("This is an unreachable statement");
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
      return Html.fromHtml("<b>This is unreachable</b>");
    }
    return Html.fromHtml(clipboard.getText().toString());
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return Html.fromHtml("<b>This is unreachable</b>");
    }
    return Html.fromHtml(mEditText.getText().toString());
  }

  void clipboardToShellDirectBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      Runtime.getRuntime().exec("echo This is unreachable");
    }
    Runtime.getRuntime().exec(clipboard.getText().toString());
  }

  void clipboardToShellArrayBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      String[] cmds = new String[] {"echo", "This is unreachable"};
      Runtime.getRuntime().exec(cmds);
    }
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return new ProcessBuilder("echo", "This is unreachable");
    }
    return new ProcessBuilder(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return new ProcessBuilder("echo", "This is unreachable");
    }
    return new ProcessBuilder("sh", clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return builder.command("echo", "This is unreachable");
    }
    return builder.command(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      List<String> cmds = new ArrayList();
      cmds.add("echo");
      cmds.add("This is unreachable");
      return builder.command(cmds);
    }
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}