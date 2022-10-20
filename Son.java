class Son extends Father{

int salary=20000;
Son(){
    System.out.println("Son Contrutor");
}
void bike(){
    System.out.println("Son bike: "+"ns200");
    super.bike();     
}
void salary(){
    System.out.println("Son salary: "+salary);
    System.out.println("Father salary: "+super.salary);
}
}
