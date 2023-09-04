import java.util.Scanner;

class Biblio {
    Livre[] myLivres;
    int nbLivres=0;
    Biblio(){
        System.out.println("constricteur par default");
        myLivres = new Livre[10];
    }
    void ajouter(){
        Scanner s = new Scanner(System.in);  
        System.out.println("donner code");
        int code =s.nextInt();
        System.out.println("donner titre ");
        String titre =s.nextLine();
        System.out.println("donner auteur ");
        String auteur =s.nextLine();
        System.out.println("donner prix ");
        float prix =s.nextFloat();
        this.myLivres[nbLivres]=new Livre(code,titre,auteur,prix);
        nbLivres++;
    }

}
