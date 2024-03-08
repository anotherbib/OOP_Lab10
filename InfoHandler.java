public class InfoHandler extends Handler {

    @Override
    public void writeLog(LogInfo log){
        if(log.getLevel().equals("INFO")){
            System.out.println("Standard Console::Logger: " + log.getMessage());
        }else if(next!=null){
            next.writeLog(log);
        }else{
            System.out.println("Not supported");
        }
    }
}
