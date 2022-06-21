package paque.com.mes_applications;
import java.util.Scanner;

public class Voiture {
    private String nomVoiture;
    private String couleurVoiture;
    private String marqueVoiture;
    private int numVoiture = 0;

 /* public void creer(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("nom de la voiture ");
        nomVoiture = sc.nextLine();
        System.out.println("couleur voiture ");
        couleurVoiture = sc.nextLine();
        System.out.println("marque :");
        marqueVoiture = sc.nextLine();
        System.out.println("l'identofiant de la ovoiture ");
        numVoiture = sc.nextInt();
    }*/

    public Voiture(String nomVoiture, String couleurVoiture, String marqueVoiture, int numVoiture) {
        this.nomVoiture = nomVoiture;
        this.couleurVoiture = couleurVoiture;
        this.marqueVoiture = marqueVoiture;
        this.numVoiture = numVoiture;
    }
    public void afficher(){
        System.out.print("nom : "+nomVoiture);
        System.out.print("couleur : "+couleurVoiture);
        System.out.print("marque : "+marqueVoiture);
        System.out.print("id : "+numVoiture);
    }

    //les accesseurs et
    public String getNomVoiture() {
        return nomVoiture;
    }

    public String getCouleurVoiture() {
        return couleurVoiture;
    }

    public String getMarqueVoiture() {
        return marqueVoiture;
    }

    public int getNumVoiture() {
        return numVoiture;
    }

    public void setNomVoiture(String nomVoiture) {
        this.nomVoiture = nomVoiture;
    }

    public void setCouleurVoiture(String couleurVoiture) {
        this.couleurVoiture = couleurVoiture;
    }

    public void setMarqueVoiture(String marqueVoiture) {
        this.marqueVoiture = marqueVoiture;
    }

    public void setNumVoiture(int numVoiture) {
        this.numVoiture = numVoiture;
    }
}
