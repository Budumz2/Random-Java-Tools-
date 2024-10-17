/*      Made by Paul Metzler
 * 
 *      Version 1.0     17:37  Donnerstag 17.10.2024 Oktober 
 * 
 *      Description:  Hier sind einfach Random Tools  
 * 
 * 
 */


import java.util.Random;
import java.io.*;

public class Alle_Programme_2 {


public static void main(String[] args) throws IOException{
// Start Main Methode    
    Start_Menue();
    Interrupt();
    ConsoleClear();
    Menue();

// Ende der Main Methode
}
          
  
  
    public static Integer Menue()throws IOException{
    BufferedReader einlesen = new BufferedReader(new InputStreamReader(System.in));
    String Option1;
    ConsoleClear();
    System.out.println(
    "\u001b[38;2;0;0;255mWas wollen Sie machen? Wählen Sie aus: \u001b[0m\n"
    + "\u001b[38;2;255;0;0m1)\u001b[0m \u001b[38;2;0;255;255m Zinseszinsen Berechner Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m2)\u001b[0m \u001b[38;2;0;255;255m Volumen berechner Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m3)\u001b[0m \u001b[38;2;0;255;255m PI berechner Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m4)\u001b[0m \u001b[38;2;0;255;255m Zahl als Text Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m5)\u001b[0m \u001b[38;2;0;255;255m Anzahl der Ziffern einer Zahl wiedergeben Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m6)\u001b[0m \u001b[38;2;0;255;255m Fakultät einer Zahl wiedergeben Tool \u001b[0m\n"
    + "\u001b[38;2;255;0;0m7)\u001b[0m \u001b[38;2;0;255;255m Fibonatchi \u001b[0m\n"
    + "\u001b[38;2;255;0;0m8)\u001b[0m \u001b[38;2;0;255;255m Quersumme \u001b[0m\n"
    + "\u001b[38;2;255;0;0m9)\u001b[0m \u001b[38;2;0;255;255m Mastercard Prüfsummen Finder \u001b[0m\n"
    + "\u001b[38;2;255;0;0m10)\u001b[0m \u001b[38;2;0;255;255m Deziaml Zahl in Binär umwandeln \u001b[0m\n"
    + "\u001b[38;2;255;0;0m11)\u001b[0m \u001b[38;2;0;255;255m 0 bis 100 Zahlen \u001b[0m");
    

  Option1 = einlesen.readLine();
  
        switch (Option1) {

        case "10":
        
            DezZuBinär();
            Continue("DezZuBinär");


         case "9":

            //Mastercard Zeile 275
            berechnePruefziffer();
            Continue("berechnePruefziffer");

         case "1":
             
         // Zeile 221
            zinseszinsen();
            Continue("zinseszinsen");
  
             
         case "2":
  
         // Zeile
            VolumenBerechner();
            Continue("VolumenBerechner");
            
         case "3":

  
            berechenpi();
            Continue("berechenpi");
  
         case "4":
             

            ziffealstext();
            Continue("ziffealstext");
             
         case "5":

            AnzahlDerZiffern();
            Continue("AnzahlDerZiffern");
             
             
         case"6":
  
                
            FakulätEinerZahl();
            Continue("FakulätEinerZahl");
  

             
         case"8":
           
              quersumme();
             
             
               Continue("quersumme");



             
         case "7":
            
            ConsoleClear();
            
            
            fibonacciIterative();
            Continue("fibonacciIterative");


         break;

       case "11":
            
            arrayss();
            Continue("arrayss");
            
            default:
                System.out.println("Ungültige Option ausgewählt");
                Interrupt();
                Menue();
                return 0; // Exit the program if an invalid option is selected
        }
      
        return 0;
  
   }
          
  
          
  
  
      public static int VolumenBerechner()throws IOException{
         BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Viel Spaß mit dem Volumen berechenr");
         System.out.println("Von was willst du den volumen Berechen Wähle aus");
         System.out.println("1) Würfel");
         System.out.println("2) Quader");
         System.out.println("3) Pyramide");
         System.out.println("4) Prisma");
         System.out.println("5) Kugel");
         System.out.println("6) Zylinder");
         System.out.println("7) Kegel");
         
         String Option2=einlesen.readLine();
         
  
         switch(Option2){
            //Würfel
            case "1":

            //VariablenkkkkkkkiimiiipipQ
            double Kantenlänge;
            String eingabe;

            ConsoleClear();
            System.out.println("Wie lang ist die Kantenlänge ");
            eingabe =einlesen.readLine();
            Kantenlänge =Double.parseDouble(eingabe);
  
            double Grundfläche = Kantenlänge*Kantenlänge;
            double Volumen = Grundfläche*Kantenlänge;
            double Oberfläche = Grundfläche*6;
            
            ConsoleClear();
            System.out.println("Dein volumen ist " + Volumen + "cm Und Deine Oberfläche ist:" + Oberfläche + "cm und das ist deine Grundfläche" + Grundfläche+ "cm" );
            
  
             
  
  
            break;

            //Quader
            case"2":
  
            System.out.println("Line a");
            eingabe=einlesen.readLine();
            double a=Double.parseDouble(eingabe);

            System.out.println("Line b");
            eingabe=einlesen.readLine();
            double b=Double.parseDouble(eingabe);

            System.out.println("Line c");
            eingabe=einlesen.readLine();
            double c=Double.parseDouble(eingabe);
            
            Grundfläche = a*b;
            Volumen = a*b*c;
            Oberfläche=2*a*b+2*a*c+2*b*c;
               
            System.out.println("Grundfläche = " + Grundfläche + " Volumen = "+ Volumen + " Oberfläche = "+ Oberfläche );
            break;
            
          }
          return 0;

      }
      public static int zinseszinsen()throws IOException{
         BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
         ConsoleClear();

          zinsen();
         double Geld;
         double Zeit;
         double Prozentsatz;
         String eingabe;

         System.out.println("Viel Spaß mit dem Zinsenrechner");
         System.out.println("Wie viel Geld wollen Sie Investieren (In Euro angeben)");
         eingabe = einlesen.readLine();
         Geld = Double.parseDouble(eingabe);
  
         System.out.println("Wie lange soll die Investition gehen (in Jahren)");
         eingabe = einlesen.readLine();
         Zeit = Double.parseDouble(eingabe);
            
             
         System.out.println("Wie hoch ist der Prozentsatz?");
         eingabe = einlesen.readLine();
         Prozentsatz = Double.parseDouble(eingabe);
  
         double Zinseszinsen = Geld * Math.pow(1 + Prozentsatz / 100, Zeit);
         double Gewinn = Zinseszinsen - Geld;
  
         System.out.println("Sie haben nach " + Zeit + " Jahren " + Gewinn + " Euro Gewinn und insgesamt: " + Zinseszinsen + " Euro.");


         Continue("zinseszinsen");

         return 0;
      }


    
    
      public static String Namee() {
        BufferedReader einlesen = new BufferedReader(new InputStreamReader(System.in));
        String Name = null; // Initialize eingabe to null
        ConsoleClear();
        try {
            System.out.println("\u001b[38;2;0;255;255mBitte geben Sie Ihren Namen ein:\u001b[0m");
            Name = einlesen.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
  
        return Name;
      }
  
      



      public static int berechnePruefziffer() throws IOException{
        BufferedReader reader =new BufferedReader (new InputStreamReader(System.in));
        ConsoleClear();

        System.out.println("Viel spaß mit dem MasterCard Prüfsummen berechener");
        String kartennummer=reader.readLine();

        int gewicht = 1;
        int quersumme = 0;
 
         for (int i = kartennummer.length() - 2; i >= 0; i--) {
             int ziffer = Character.getNumericValue(kartennummer.charAt(i));
             int gewichtet = ziffer * gewicht;
 
             // Schritt 2: Berechnen der Quersumme
             quersumme += gewichtet / 10 + gewichtet % 10;
 
             // Wechseln des Gewichts zwischen 1 und 2
             gewicht = 3 - gewicht;
         }
 
         // Schritt 3: Bestimmen des Restes
         int rest = quersumme % 10;
 
         // Schritt 4: Berechnen der Prüfziffer
         int pruefziffer = (rest == 0) ? 0 : 10 - rest;

         System.out.println("Die Prüfsummer der Mastercard von ;"+kartennummer+" ist: " +pruefziffer);
 
         return pruefziffer;
     }

    
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = {
        "\u001B[31m", // Red
        "\u001B[32m", // Green
        "\u001B[33m", // Yellow
        "\u001B[34m", // Blue
        "\u001B[35m", // Purple
        "\u001B[36m",// Cyan
        "\u001B[37m",
        "\u001B[38m", // Red
        "\u001B[39m", // Green
        "\u001B[40m", // Yellow
        "\u001B[41m", // Blue
        "\u001B[42m", // Purple
        "\u001B[43m",
        "\u001B[44m",
        "\u001B[45m"};

public static String ColorRandomizer(String text){
    
    Random random = new Random();
        String color = COLORS[random.nextInt(COLORS.length)];
        return color + text + RESET;
    
    
}
      public static int Continue(String CurrentMethod)throws IOException{
         BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Back to Menue\u001b[32m 1)\u001b[0m ");
         System.out.println("Again\u001b[32m 2)\u001b[0m "+CurrentMethod);
         System.out.println("Exit\u001b[32m 3)\u001b[0m ");

         
         String  eingabe =einlesen.readLine();
        

          switch(eingabe){
              
            case "1":
             ConsoleClear();
             Menue();
             break;
              
            case "2":
              switch(CurrentMethod){
                  
                  case "zinseszinsen":
                  
                  zinseszinsen();
                  
               break;    
                  
                  case "DezZuBinär": 
                  
                  DezZuBinär();
                  
                  break;
                  
                  
                  case "VolumenBerechner":
                  
                  VolumenBerechner();
                  
                  break;
                  
                  case "berechnePruefziffer":
                  
                       berechnePruefziffer();
                  
                  break;
                  
                  case  "berechenpi":
                  
                  berechenpi();
                  
                  break;
                  
                  
                  case "ziffealstext":
                  
                  ziffealstext();
                  
                  break;
                  
                  
                  case "AnzahlDerZiffern":
                  
                  AnzahlDerZiffern();
                  
                  break;
                  
                  
                  case "FakulätEinerZahl":
                  
                  FakulätEinerZahl();
                  
                  break;
                  
                  case "quersumme":
                  
                  quersumme();
                  
                  break;
                  
                  
                  case "fibonacciIterative":
                  
                  fibonacciIterative();
                  
                  break;
                  
                  case "arrayss":
                  
                  arrayss();
                  break;
                  
              }
              
              
            case "3":

              System.out.println("\u001b[38;2;255;0;0mThanks for using the program Bye\u001b[0m");
              break;
              
              default:
              Menue();
          }
          return 0;
      }


public static String Start_Menue(){
   String text ="Made by Paul Metzler";
    System.out.println(ColorRandomizer(text));
    
    return text;
    
    
}
      public static double berechenpi() throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ConsoleClear();
        String LUL;

        System.out.println("Viel Spaß mit dem Pi berechenr");
        System.out.println("Wie viele Iterationen soll der Pi berechnet werden?");

       LUL=reader.readLine();
        int iteration=Integer.parseInt(LUL);
        

        double pi = Math.PI;
        double zaehler = -1;
    
        for (int nenner = 3; nenner <= iteration; nenner = nenner + 2) {
            pi = pi + zaehler / nenner;
            zaehler = zaehler * (-1);
        }
    
        pi = pi * 4;
    
        System.out.println("PI ist ungefähr: "+pi);
        return pi;
      }
    
      public static  int prüfsumm(){
         int n=0;
         int quersumme=0;
         while (n>0) {
            n=n/10;
            quersumme=quersumme+n;
         }

         if (quersumme==0) {
            
            return 0;
         }
         else
         return 0;

      }
  
      public static String ziffealstext()throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        ConsoleClear();

        System.out.println("Viel Spaß mit dem Ziffern als Text");
        System.out.println("Gib eine Zahl ein");

        String eingabe;
        eingabe=reader.readLine();
        int ziffer=Integer.parseInt(eingabe);



                 switch(ziffer){
         
                    case 0: return "null";
                    case 1: return "eins";
                    case 2: return "zwei";
                    case 3: return "drei";
                    case 4: return "vier";
                    case 5: return "fünf";
                    case 6: return "sechs";
                    case 7: return "sieben";
                    case 8: return "acht";
                    case 9: return "neun";
                    
                    default: return"keine ziffer oder zu hoch";
                 }
  
      }
  
  
    public static String DezZuBinär() throws IOException{

        BufferedReader reader =new BufferedReader (new InputStreamReader(System.in));
        StringBuilder binär = new StringBuilder();
        ConsoleClear();

        System.out.println("Wandelt eine Deziamal Zahl in binär");

        String eingabe;
        eingabe=reader.readLine();
        int Dez=Integer.parseInt(eingabe);
        int l=Dez;
        

    
        while (Dez > 0) {
            if (Dez % 2 == 0) {
                binär.insert(0, "0");
            } else {
                binär.insert(0, "1");
            }
            Dez /= 2;
        }

    System.out.println(l + " ist in Binär " + binär);
        
        
        Continue("DezZuBinär");
    return binär.toString();
}

     public static int quersumme()throws IOException{
         BufferedReader reader =new BufferedReader (new InputStreamReader(System.in));
          ConsoleClear();
         String eingabe;
             System.out.println("eine Quersumme der eingegeben Zahl");
             eingabe=reader.readLine();
            int zahl=Integer.parseInt(eingabe);
        int Quersumme=0;
        while(zahl>0){
           Quersumme+=zahl%10;
           zahl=zahl/10; 
            
            
            
        }
         
        System.out.println("Quersumme :"+Quersumme);
         
         Continue("quersumme");
         
         
        return Quersumme;
        
        
        
    }
    

        public static String AnzahlDerZiffern ()throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ConsoleClear();
    
            System.out.print("Gib eine Zahl ein: ");
            String input = reader.readLine();
    
            int zahl = Integer.parseInt(input);
            int anzahlZiffern = 0;
    
            while (zahl > 0) {
                zahl /= 10;
                anzahlZiffern++;
            }
    
            System.out.println("Die Zahl " + input + " hat " + anzahlZiffern + " Ziffern.");
            return "";
        }
    
  
      public static String ASCII_Art_for_Zinsenberechner(){

        String face =  "  ^__^  \n" +
                " (oo)\"\"\"\n" +
                "  --^^--  ";
        System.out.println(face);


        return "";
      }

      public static int FakulätEinerZahl()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ConsoleClear();

        System.out.println("Gib Eine zahl ein");

        String eingabe =reader.readLine();
        int lul=Integer.parseInt(eingabe);
        int lastt=lul;
          int zahl=lastt;


          for(int i=0;i<lastt;i++){
              
             lul=  lul*lastt;
               lastt =lastt-1;
              
          }
          
          System.out.println("Die fakultät von "+zahl+" ist :"+lul);
          

    return lul;

    }

      public static int  Fakultät2(int n){
         BufferedReader einlesen = new BufferedReader(new InputStreamReader(System.in));
         String DeineZahl;
         int a;
         
          
         
         
         for (int i=0;i<n;i++){
           
             a = + n*i;


         }


         return  0;
      }





   public static int fibonacciIterative()throws IOException {
       
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String eingabe;
       System.out.println("Viel Spaß mit dem Fibontcci tool");
       System.out.println("Gib die ein monate :");
       
              eingabe=reader.readLine();
              int n =Integer.parseInt(eingabe);
       
       if (n<=1) return n;
       int fib =1;
       int prevFib=1;
       
       for(int i =2; i<n; i++){
           int temp = fib;
           fib+=prevFib;
           prevFib=temp;
           
           
       }
       System.out.println("fib: "+fib+" Nach "+n+" Monaten");
       return fib;


   }      
  
    public static String Interrupt(){
        
        try{
           Thread.sleep(2000);
          
          }
       
       catch(InterruptedException e){
           System.out.println("Thread Interrupted");
       }
        
        return "";
    }
    
    
    public static int arrayss(){
        
        int arreay []=new int [100];
        for(int i=0;i<arreay.length;i++){
            
            arreay[i]=i;
            
        System.out.println(arreay[i]);
        }
        
        return 0;
    }
   public static String ConsoleClear(){

      System.out.print("\033[H\033[2J");
      return"";

   }
    
    public static String zinsen(){
        
        
        
    String a=(
        "0000000\n"+
        "0000000\n"+
        "    00\n"+
        "   00\n"+
        "  00\n"+
        " 00\n"+
        "00\n"+
        "00\n"+
        "0000000\n"+
        "0000000");
      
        String b=(
        "000\n"+
        "000\n"+
        "   \n"+
        "000\n"+
        "000\n"+
        "000\n"+
        "000\n"+
        "000  \n"+
        "000\n"+
        "000\n"
        );
        
        
        
        String c=(
        "    0000000\n"+
        "  000000\n"+
        " 00000\n"+
        "000\n"+
        " 000\n"+
        "   000\n"+
        "    000\n"+
        "   000\n"+
        "  0000\n"+
        "000000\n"
        );
        
        String d=("lul");
        
        
        
                String[] aLines = a.split("\n");
        String[] bLines = b.split("\n");

        StringBuilder combined = new StringBuilder();

        for (int i = 0; i < aLines.length; i++) {
            combined.append(aLines[i]).append(" ").append(bLines[i]).append("\n");
        }

        System.out.print(combined.toString());
        
        
        return "";
    }

  }

  
 
