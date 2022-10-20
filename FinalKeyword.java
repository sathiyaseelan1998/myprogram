final class FinalKeyword{ //can not inherit

final String name="jd"; //can not reassign

final void show(){ //can not override
    System.out.println("final method");
}
public static void main(String arg[]){

FinalKeyword fk=new FinalKeyword();
System.out.println(fk.name);
fk.show();

}

}
