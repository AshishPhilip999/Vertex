package Testing;

import OutputStream.*;

public class Main{

    public static void main(String[] args){
        Print p = new Print();
        _Error e = new _Error();

        p.print("Welcome to Vertex.");
        p.print("Fetching Register ... ");

        e.print("No register found");
    }
}