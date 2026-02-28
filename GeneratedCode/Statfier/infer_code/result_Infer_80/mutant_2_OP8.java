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
  }

  Spanned clipboardToHtmlBad() {
    return Html.fromHtml(clipboard.getText().toString());
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    return Html.fromHtml(mEditText.getText().toString());
  }

  void clipboardToShellDirectBad() throws IOException {
    Runtime.getRuntime().exec(clipboard.getText().toString());
  }

  void clipboardToShellArrayBad() throws IOException {
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    return new ProcessBuilder(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    return new ProcessBuilder("sh", clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    return builder.command(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);
  }

  // Mutated code
  void readClipboardSourcesBadMutant() {
    ClipboardManager x = clipboard;
    InferTaint.inferSensitiveSink(x.getText());
    InferTaint.inferSensitiveSink(x.getPrimaryClip());
    InferTaint.inferSensitiveSink(x.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(x.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(x.getPrimaryClip().toString());
    // 5 reports
  }

  Spanned clipboardToHtmlBadMutant() {
    ClipboardManager y = clipboard;
    return Html.fromHtml(y.getText().toString());
  }

  Spanned editTextToHtmlBadMutant() {
    EditText z = mEditText;
    return Html.fromHtml(z.getText().toString());
  }

  void clipboardToShellDirectBadMutant() throws IOException {
    ClipboardManager w = clipboard;
    Runtime.getRuntime().exec(w.getText().toString());
  }

  void clipboardToShellArrayBadMutant() throws IOException {
    ClipboardManager v = clipboard;
    String[] cmds = new String[] {"ls", v.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1BadMutant() {
    ClipboardManager u = clipboard;
    return new ProcessBuilder(u.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2BadMutant() {
    ClipboardManager t = clipboard;
    return new ProcessBuilder("sh", t.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3BadMutant(ProcessBuilder builder) {
    ClipboardManager s = clipboard;
    return builder.command(s.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4BadMutant(ProcessBuilder builder) {
    ClipboardManager r = clipboard;
    List<String> cmds = new ArrayList();
    cmds.add(r.getText().toString());
    return builder.command(cmds);
  }
}