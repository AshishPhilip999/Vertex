package Vertex;

public class Value{

   private Datatype type;
   private String raw;

   public Value(Datatype type, String value){
      this.type = type;

    //   switch (type) {
    //     case Datatype.STRING:
            
    //         break;
      
    //     default:
    //         break;
    //   }

      this.raw = value;
   }

   public Datatype getType() {
       return type;
   }

   public String getrawValue(){
     return raw;
   }

   private void matchToDatatype(Datatype type, String value){
      
   }
}