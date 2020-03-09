package com.vvit.clothes;

import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.Level;

interface Clothes {

public void assemble();
}
class CasualWear implements Clothes {

public void assemble() {
System.out.print("Casual Dress.");
}

}

class NightWear implements Clothes {

protected Clothes clothes;

public NightWear(Clothes c){
this.clothes=c;
}


public void assemble() {
this.clothes.assemble();
}

}
 class Formals extends NightWear {

public Formals(Clothes c) {
super(c);
}


public void assemble(){
super.assemble();
System.out.print(" Adding features of Formals.");
}
}
 class HalfSaree extends NightWear {

public HalfSaree (Clothes c) {
super(c);
}


public void assemble(){
super.assemble();
System.out.print(" Adding features of HalfSaree.");
}
}


public class App
{
      private static final Logger l=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
   
    public static void main( String[] args )
    {
       l.log(Level.INFO,"use of memento behaviour pattern and decorate structural pattern");
       Clothes sportsCar = new Formals(new CasualWear());
       Clothes lC=new HalfSaree(new CasualWear());
sportsCar.assemble();
                lC.assemble();
System.out.println("\n*****");

Clothes sportsLuxuryCar = new Formals(new HalfSaree(new CasualWear()));
sportsLuxuryCar.assemble();
       l.log(Level.INFO,"program terminated");
       
    }
}

