class Students extends College{

void hobby(){
    System.out.println("playing cricket");

}
int age(int age){
    return age;
}
void mobile(){
    System.out.println("mi");
}
public static void main(String arg[]){

    College s=new Students();//dynamic binding
    s.hobby();
    address();//static method
    System.out.println(s.age(24));
    s.noOfSudent();
   // s.mobile();---> dynamic binding can't call own child properties

}

}
