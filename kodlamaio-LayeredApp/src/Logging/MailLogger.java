package Logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logging to Mail : "+data);
    }
}
