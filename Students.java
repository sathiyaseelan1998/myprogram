class Students extends College{

void hobby(){
    System.out.println("playing cricket");

}
int age(int age){
    return age;
}
public static void main(String arg[]){

    Students s=new Students();
    s.hobby();
    address();//static method
    System.out.println(s.age(24));
}

}
