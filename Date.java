import java.util.Scanner;

class Date {
  // attributs
  int J;
  int M;
  int A;

  //constructeurs
    Date (){
      Scanner s = new Scanner(System.in);  
    System.out.println("Enter jours");
    this.J=s.nextInt();
      
    System.out.println("Enter mois");
    this.M=s.nextInt();
       
    System.out.println("Enter annee");
    this.A=s.nextInt();
      
    }
  //methodes 
  void ChangerDate(int J,int M,int A){
    this.J=J;
    this.M=M;
    this.A=A;
    

  }
  void afficher(){
    System.out.println("Date: "+this.A+"/"+this.M+"/"+this.J);
  }
  int DiffDate(Date d){
    int res=0;
    res= Math.abs((this.A-d.A-1)*365+((this.M-1)+(12-d.M))*30+(this.J+(30-d.J)));

  
    return res;

  }
  
    public static void main(String[] args){
      /*  Date d=new Date();
      d.afficher();
      d.ChangerDate(2,3,2023);
      d.afficher();*/
    
    Date d1=new Date();
    Date d2=new Date();
    System.out.println("la difference  est "+d1.DiffDate(d2)+" jours"); 
    

    }

}

