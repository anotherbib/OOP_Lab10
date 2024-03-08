public class Handler {
    protected Handler next;

    public void setHandler(Handler handler){
        if(next != null){
            next.setHandler(handler);
        }else{
            next = handler;
        }
    }

    public void writeLog(LogInfo log){
        if (next != null) {
			next.writeLog(log);
		}
    }

}
