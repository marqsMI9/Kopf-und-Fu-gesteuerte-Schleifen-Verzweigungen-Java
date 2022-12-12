public class javagrundlagen{
  public static void main(String[] arg){
    
    while(Bedingung){
      Kommando;             //Während eine Bedingung zutrifft wird das Kommando ausgeführt.
    }                       //Hier handelt es sich um eine kopfgesteuerte Schleife, weil die Prüfung oberhalb der Schleife stattfindet.
    
    for(Anfangswert;Abbruchbedingung;Schrittweiße){
      Kommando;             //Eine "Zählerschleife", diese wird von einem bestimmten Anfangswert bis zu einer Abbruchbedingung durchlaufen.
    }                       //Hier handelt es sich wieder um eine Kopfgesteuerte Schleife.
    
    do{
      Kommando;             //Eine fußgesteuerte Schleife, weil die Bedingungsabfrage erst nach dem ersten Durchlauf stattfindet.
    }while(Bedingung)
     
    if(Bedingung){
      Kommando;             //Verzweigung wird einmal ausgeführt wenn Bedingung zutrifft.
    }
    
    switch(Schlüsselvariable){
      case 1 :{
        Kommando1;
        break;
      }                     //Eine bestimmte Variable wird geprüft was zutrifft. In diesem Fall ob die "Schlüsselvariable 1,2 oder etwas Anderes(default) ist.
      case 2 :{             //Wenn z.B.: ist die "Schlüsselvariable" genau 1, dann wird Kommando1 ausgeführt. Ist sie jedoch 4 wird default, also KommandoDefault
        Kommando2;         //ausgeführt.
        break;
      }
      default :{
        KommandoDefault;
        break;
      }
    }
  }
}
