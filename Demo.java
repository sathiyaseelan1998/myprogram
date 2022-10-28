class Demo{

public static void main(String arg[]){

    PojoClass p=new PojoClass();
    System.out.println("Before setting:"+p.getName());
    System.out.println("Before setting:"+p.getAge());
    p.setAge(50);
    p.setName("sachin");
    System.out.println("After setting:"+p.getName());
    System.out.println("After setting:"+p.getAge());
}
}
