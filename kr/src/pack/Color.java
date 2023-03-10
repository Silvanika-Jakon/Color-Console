package pack;

public enum Color {
    BLACK("\033[0;30m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    MAGENTA("\033[0;35m"),
    CYAN("\033[0;36m"),
    WHITE("\033[0;37m"),
    RESET("\033[0m");

    private final String a_c;

    Color(String ansi_color) {
        a_c = ansi_color;
    }
    
    public String getA_c() {
        return a_c;
    }
   
}
