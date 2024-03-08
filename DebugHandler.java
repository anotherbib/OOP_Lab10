public class DebugHandler extends Handler {

    @Override
    public void writeLog(LogInfo log){
        if(log.getLevel().equals("DEBUG")){
            System.out.println("File::Logger: "+ log.getMessage());
            System.out.println("Standard Console::Logger: " + log.getMessage());
        }else if(next!=null){
            next.writeLog(log);
        }else{
            System.out.println("Not supported");
        }
    }
}
