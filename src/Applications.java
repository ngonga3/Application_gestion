import paque.com.mes_applications.Voiture;
import java.util.Scanner;

public class Applications {
    public static void main(String[] elements){

      int[] notes;
      System.out.println("combien de notes ");
      Scanner sc = new Scanner(System.in);
      int nbre;
      nbre = sc.nextInt();
      notes = new int[nbre];
      for (int i=0; i<notes.length; i++){
          System.out.println("entre la note "+(i+1));
          notes[i]=sc.nextInt();
      }
     /* notes[0] =80;
      notes[1] =55;
      notes[2] =5;
      notes[3] =15;
      notes[4] =100;
      notes[5] =2;
      notes[6] =38;
      notes[7] =77;
      notes[8] =258;
      notes[9] =595;*/


      int max = 0;
      int min = 11;
      System.out.println("Voici les notes ");
      for (int i =0; i<notes.length; i++){
          System.out.println("note "+(i+1)+"  ="+notes[i]);
      }
      System.out.println("");
      for (int i =0; i<notes.length; i++){
            if (notes[i]>max){
                max = notes[i];
            }

      }
        for (int i =0; i<notes.length; i++){
            if (notes[i]<min){
                min = notes[i];
            }

        }
      System.out.println("la grande note est : "+max);
      System.out.println("la petite notes est : "+min);

      System.out.println("quel nombre cherchez-vous ?");
      int nombre=0;
      int somme;

      nombre = sc.nextInt();

       for (int i=0; i<notes.length; i++){

           if (notes[i]==nombre){
               System.out.println("la note "+notes[i]+" est a la position "+(i+1));
           }
           else{
               System.out.println("la notes n'existe pas !!!! ");

           }
       }

       for(int i =0; i<11; ++i){
           somme = i*nombre;
           System.out.println(""+i+" X "+nombre+" = "+somme);
       }

    }
    public double Verifier(){
        double V1=11.2;
        return V1;
    }
}


