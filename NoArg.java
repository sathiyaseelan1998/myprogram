class NoArg{

int age;
NoArg(){
    int age=23;
    this.age=age;
    System.out.println("No-Agr or Zero-Arg constructor");
}
void demo(){
    System.out.println(age);
}
public static void main(String arg[]){

NoArg n=new NoArg();
n.demo();
}

}
