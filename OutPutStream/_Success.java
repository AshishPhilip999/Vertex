package OutputStream;

public class _Success extends Print {

    private String open_symbol_success = " ✅ ";
    private String close_symbol_success = " ";

    private Color default_color_success = Color.GREEN;
    
    public _Success(){
        init();
    }

    public _Success(String message){
        init();
        print(message);
    }

    private void init(){
        this.default_color = default_color_success;
        this.open_symbol = open_symbol_success;
        this.close_symbol = close_symbol_success;
    }

}