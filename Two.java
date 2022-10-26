class Two{

void info(One one){

System.out.println("Name: "+one.name);
System.out.println("Address: "+one.address);
System.out.println("Salary: "+one.salary);
}

public static void main(String arg[]){

One one=new One();
Two two=new Two();
two.info(one);
}

}
