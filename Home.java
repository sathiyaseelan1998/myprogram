class Home{

int ebRead(int unit){

    int amount=unit*2;
    return amount;
}

public static void main(String arg[]){

    Home h=new Home();
    int amount=h.ebRead(100);

    System.out.println(amount);
    }

}
