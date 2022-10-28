class Implementing implements Inter2,Inter3{

public void play(){

System.out.println("playing cricket");

}

public int salary(int salary){

return salary;
}
public void ride(){
System.out.println("i am travelling to chennai");
}

public void show(){
System.out.println("i am Inter3 method");
}
public static void main(String arg[]){

    Implementing imp=new Implementing();
    imp.play();
    System.out.println(imp.salary(50000));
    System.out.println(imp.name);
    imp.ride();
    imp.show();
    System.out.println("-------------dynamic binding---------");
    Inter1 imp1=new Implementing();
    imp1.play();
    System.out.println(imp1.salary(50000));
    System.out.println(imp1.name);
   /* imp1.ride();
    imp1.show();*/ //can't use Inter1 object 
}

}
