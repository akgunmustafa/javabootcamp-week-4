package Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logging to File : "+data);
    }
}
