class MethodOverload{

void sum(int sub1,long sub2){
    
    System.out.println(sub1+sub2);

}
 void sum(long sub1,int sub2){
    
    System.out.println(sub1+sub2);

}

public static void main(String arg[]){
    
    MethodOverload mo=new MethodOverload();
    mo.sum(70,100);
    mo.sum(90,60);
    
    }

}
/*
    Error:
    
    MethodOverload.java:17: error: reference to sum is ambiguous
    mo.sum(70,100);
      ^
  both method sum(int,long) in MethodOverload and method sum(long,int) in MethodOverload match
MethodOverload.java:18: error: reference to sum is ambiguous
    mo.sum(90,60);
      ^
  both method sum(int,long) in MethodOverload and method sum(long,int) in MethodOverload match
2 errors




*/
