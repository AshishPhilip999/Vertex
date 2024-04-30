package OutputStream;

public class _Warning extends Print{

    private String open_symbol_warning = " ⚠️  ";
    private String close_symbol_warning = "";

    private Color default_color_error = Color.YELLOW;
    
    public _Warning(){
        init();
    }

    public _Warning(String message){
        init();
        print(message);
    }

    private void init(){
        this.default_color = default_color_error;
        this.open_symbol = open_symbol_warning;
        this.close_symbol = close_symbol_warning;
    }
}