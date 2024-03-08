public class LogInfo {
    private final String level;
    private final String message;

    public LogInfo(String level, String msg){
        this.level = level;
        this.message = msg;
    }

    public String getLevel(){
        return level;
    }

    public String getMessage(){
        return message;
    }
}
