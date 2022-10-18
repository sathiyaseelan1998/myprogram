class Child extends Parent{

int age=25;
String name="dhru";

void salary(){
    System.out.println(250000);
}
public static void main(String args[]){

Child child=new Child();
System.out.println("Name:"+child.name);
System.out.println("Age:"+child.age);
System.out.println("Address:"+child.address);

child.salary();
String profession=child.profession();
System.out.println(profession);

}

}
