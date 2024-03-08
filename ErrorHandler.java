public class ErrorHandler extends Handler{
    

    @Override
    public void writeLog(LogInfo log){
        if(log.getLevel().equals("ERROR")){
            System.out.println("Error Console::Logger: " + log.getMessage());
            System.out.println("File::Logger: "+ log.getMessage());
            System.out.println("Standard Console::Logger: " + log.getMessage());
        }else if(next!=null){
            next.writeLog(log);
        }else{
            System.out.println("Not supported");
        }
    }
}
