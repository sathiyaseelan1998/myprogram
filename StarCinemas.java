class StarCinemas{
static String address="no.2 thuraiyur";
String movieName;
float movieTime;
boolean movieHit;

public static void main(String arg[]){

    StarCinemas star1=new StarCinemas();
    star1.movieName="ps-1";
    star1.movieTime=10.00f;
    star1.movieHit=true;
    StarCinemas star2=new StarCinemas(); 
    star2.movieName="cobra";
    star2.movieTime=2.30f;
    star2.movieHit=false;
    StarCinemas star3=new StarCinemas();

    System.out.println("screen 1=> "+"movie name: "+ star1.movieName+"     time: "+star1.movieTime+"    movie hit: "+star1.movieHit);
    System.out.println("screen 2=> "+"movie name: "+ star2.movieName+"     time: "+star2.movieTime+"    movie hit: "+star2.movieHit);
    System.out.println("screen 3=> "+"movie name: "+ star3.movieName+"     time: "+star3.movieTime+"    movie hit: "+star3.movieHit);

    //calling static varible
    System.out.println("address : "+StarCinemas.address);// called by class name
    System.out.println("address : "+star3.address);//called by object name
    System.out.println("address : "+address);//call directly

}

}
