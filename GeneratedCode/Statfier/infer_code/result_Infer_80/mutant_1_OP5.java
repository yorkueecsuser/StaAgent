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
    InferTaint.inferSensitiveSink(clipboard.getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().toString());
    // 5 reports

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  Spanned clipboardToHtmlBad() {
    return Html.fromHtml(clipboard.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    return Html.fromHtml(mEditText.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void clipboardToShellDirectBad() throws IOException {
    Runtime.getRuntime().exec(clipboard.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void clipboardToShellArrayBad() throws IOException {
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    return new ProcessBuilder(clipboard.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    return new ProcessBuilder("sh", clipboard.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    return builder.command(clipboard.getText().toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}