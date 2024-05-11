package OutPutStream;
public class Print implements Printable {

    protected Color default_color = Color.RESET;
    protected Color reset_color = Color.RESET ;

    protected String open_symbol = "[";
    protected String close_symbol = "]";
    protected String message;

    public Print(){
        // empty constructor
    }

    public Print(String message){
        print(message);
    }

    public void print(String message){
        onStart();
        onStartFollow();
        System.out.print(message);
        onEnd();
        onEndFollow();
    }

    public void onStart(){
        System.out.print(default_color + open_symbol);
    }

    public void onEnd(){
         System.out.print( close_symbol + reset_color) ;
         System.out.println();
    }

    public void onStartFollow(){ }
    public void onEndFollow(){ }
}