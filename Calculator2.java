class Calculator2{

void add(int mark){
    System.out.println(10+mark);
}

void add(int mark1,int mark2){
    System.out.println(mark1+mark2);
}

void add(int mark1,int mark2,int mark3){
    System.out.println(mark1+mark2+mark3);
}
void add(int avg1,float avg2){
    System.out.println(avg1+avg2);
}

public static void main(String arg[]){

    Calculator2 calc=new Calculator2();
    calc.add(10);
    calc.add(10,20);
    calc.add(10,20,30);
    calc.add(10,20.25f);
}

}
