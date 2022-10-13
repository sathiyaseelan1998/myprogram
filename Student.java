class Student{
int id;
String name,lab,sports,dept;
Student(){
    System.out.println("welcome");
}
Student(int id,String name,String dept){
    this.id=id;
    this.name=name;
    this.dept=dept;
}
Student(int id,String name,String dept,String lab){
    this.id=id;
    this.name=name;
    this.lab=lab;
    this.dept=dept;
}
Student(int id,String name,String dept,String lab,String sports){
    this.id=id;
    this.name=name;
    this.lab=lab;
    this.sports=sports;
    this.dept=dept;
}
void info(){
    System.out.println("Id:"+id+"   Name:"+name+"   Department:"+dept+"   Lab:"+lab+"   Sports:"+sports);
}
public static void main(String arg[]){

Student s=new Student();
Student s1=new Student(1,"vijay","BA");
Student s2=new Student(2,"kumar","computer science","java lab");
Student s3=new Student(3,"david","chemistry","chemistry lab","cricket");

s1.info();
s2.info();
s3.info();
}
}
