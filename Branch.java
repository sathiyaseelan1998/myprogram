package tamilnadu.erode;
import tamilnadu.chennai.Office;
public class Branch extends Office{
public static void main(String arg[]){

    Branch branch=new Branch();
    System.out.println("Salary : "+branch.salary());
    branch.work();
}

}
