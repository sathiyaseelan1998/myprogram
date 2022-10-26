class Copy{

String name;
int age;
Copy(){
    System.out.println("No-Arg Constuctor");
}

Copy(Copy copy){

    this.name=copy.name;
    this.age=copy.age;
    System.out.println(this.name+"...."+this.age);
}

public static void main(String arg[]){

    Copy c=new Copy();
    c.name="dhoni";
    c.age=50;
    Copy c1=new Copy(c);
    
}

}
