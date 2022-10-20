class Grandson extends Son{
int salary=15000;
Grandson(){
     
    System.out.println("Grandson Contrutor");
}
Grandson(int amount){
    this();
    System.out.println(amount);
}
void bike(){
    System.out.println("Grandson bike: "+"R15");
    super.bike();     
}
void salary(){
    System.out.println("Grandson salary:"+salary);
    super.salary();
}


public static void main(String arg[]){

    Grandson g=new Grandson(50000);
    g.bike();
    g.salary();
   
}
}
