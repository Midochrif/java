import java.util.Scanner;

class Rectangle {
    float longeur;
    float largeur;
    //constructeur
    Rectangle(){
        Scanner s = new Scanner(System.in);  
    System.out.println("Enter longeur");
    this.longeur=s.nextFloat();
     System.out.println("Enter largeur");
    this.largeur=s.nextFloat();
    }
   float perimetre(){
    return(this.longeur+this.largeur)*2;
    }
    float surface(){
        return(this.longeur*this.largeur);
    }

    
}
