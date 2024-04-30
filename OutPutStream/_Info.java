package OutputStream;

public class _Info extends Print {

    private String open_symbol_info = " ℹ️  ";
    private String close_symbol_info = " ";

    private Color default_color_info = Color.BLUE;
    
    public _Info(){
        init();
    }

    public _Info(String message){
        init();
        print(message);
    }

    private void init(){
        this.default_color = default_color_info;
        this.open_symbol = open_symbol_info;
        this.close_symbol = close_symbol_info;
    }
}