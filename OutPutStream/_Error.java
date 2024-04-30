package OutputStream;

public class _Error extends Print {

    private String open_symbol_error = " ❌ ";
    private String close_symbol_error = "";

    private Color default_color_error = Color.RED;
    
    public _Error(){
        init();
    }

    public _Error(String message){
       init();
       print(message);
    }

    private void init(){
        this.default_color = default_color_error;
        this.open_symbol = open_symbol_error;
        this.close_symbol = close_symbol_error;
    }

}