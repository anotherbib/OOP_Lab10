public class App {
    public static void main(String[] args) {
        LogInfo log = null;
        Handler DebugHandler = new DebugHandler();
        Handler ErrorHandler = new ErrorHandler();
        Handler InfoHandler = new InfoHandler();

        DebugHandler.setHandler(ErrorHandler);
        ErrorHandler.setHandler(InfoHandler);

        log = new LogInfo("INFO", "This is an information.");
        DebugHandler.writeLog(log);

        System.out.println("------------------------------------------------------");

        log = new LogInfo("DEBUG", "This is a debug information.");
        DebugHandler.writeLog(log);

        System.out.println("------------------------------------------------------");
        
        log = new LogInfo("ERROR", "This is an error information.");
        DebugHandler.writeLog(log);
    }
}
