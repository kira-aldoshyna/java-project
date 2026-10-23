import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));
        Properties messages = new Properties();
        try (Reader reader = new InputStreamReader(new FileInputStream("resources/messages.properties"), StandardCharsets.UTF_8)) {
            messages.load(reader);
        }
        System.out.println(messages.getProperty("app.title"));
        System.out.println(messages.getProperty("app.greeting"));
    }
}
