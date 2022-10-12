class ConstructorExample{

String name,email;
int age;
ConstructorExample(String name,String email, int age){

this.name=name;
this.email=email;
this.age=age;

}

void info(){

    System.out.println("Name: "+name+"    Email: "+email+"   Age :"+age);
}

public static void main(String arg[]){

ConstructorExample cricket=new ConstructorExample("dhoni","dhoni@gmail.com",40);
ConstructorExample football=new ConstructorExample("messi","messi@gmail.com",35);
ConstructorExample wwe=new ConstructorExample("roman","roman@gmail.com",38);
cricket.info();
football.info();
wwe.info();

}
}
