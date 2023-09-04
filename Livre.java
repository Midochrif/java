 class Livre {
    //attributs
    private int code;
    private String titre;
    private String auteur;
    private float prix;
    //construvteur
    Livre(int code, String titre, String auteur,float prix){
        this.code =code;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    //accesseurs et modificateur
    int getCode(){
        return code;
    }
    void setCode(int code){
        this.code=code;
    }
    String getTitre(){
        return titre;
    }
    void setTitre(String titre){
        this.titre=titre;
    }
    String getauteur(){
        
        return auteur;
    }
    void setAuteur(String auteur){
        this.auteur=auteur;
    }
    float getPrix(){
        return prix;
    }
    void setPrix(float prix){
        this.prix=prix;
    }
    //Methodes
    void afficher(){
        System.out.println("Livre \n code: "+this.code+"\n titre"
        +this.titre+"\n auteur"+this.auteur+"\n prix"+this.prix);
    }
    
}
