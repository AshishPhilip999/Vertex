package OutputStream;

public interface Printable{
    public void print(String message); // To Print message to console
    public void onStart(); //  First to execute when print is called.
    public void onEnd();   //  Last to execute when print is called.
    public void onStartFollow(); // is followed by onStart.
    public void onEndFollow();   // is followed by onEnd.
}