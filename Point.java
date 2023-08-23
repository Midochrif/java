class Point {

  int x;
  int y;

Point(int x ,int y){
  this.x = x!=0? x:1;
  this.y = y!=0? y:1;

this.x = x;
this.y = y;
}
Point(){
  System.out.println("constructeur par defaut");
}
Point(int a){
  this.x =a;
  this.x =y;

}
void afficher(){

  System.out.println("x="+x+"y="+y);
}
void deplacer(int a, int b){

  x+=a;
  y+=b;
}
double distance(Point M){
  double res;
  res =Math.sqrt((M.x-this.y)*(M.x-this.y)+(M.y-this.y)*(M.y-this.y));
  return res;
}
public static void main(String[] args) {

Point A=new Point();
Point B=new Point(1);
Point C=new Point(1,2);

A.afficher();


B.afficher();
C.afficher();

}
}