class Cercle {
    Point o;
    double r;
    Cercle (int x,int y, double r){
        this.o = new Point(x,y);
        this.r = r;

    }
    double surface(){
        return 3.14*this.r*this.r;

    }
    double perimetre(){
        return 2*3.14*this.r;

    }
    void afficher(){
        System.out.println("cercle:");
        this.o.afficher();
        System.out.println("r="+ this.r);
    }
     public static void main(String args []) {
        Cercle C =new Cercle(2,3,5);
        C.afficher();
        C.o.deplacer(1, 4);
        C.afficher();
            
        
    }
}
