class Son extends Father{

int salary=20000;
void bike(){
    System.out.println("ns200");
    super.bike();     
}
void salary(){
    System.out.println(salary);
    System.out.println(super.salary);
}
/*int loan(){
    long amount=super.loan();
    int balance=(int)amount-50000;
    return balance;
}*/

public static void main(String arg[]){

    Son son=new Son();
    son.bike();
    son.salary();
    /*System.out.println(son.loan());*/
}
}
