package Jvdreersimao_Patterns.adapter;

class LegacyLogger {
    public void log(String level, String text) {
        System.out.println(String.format("[%s] %s", level, text));
    }
}
