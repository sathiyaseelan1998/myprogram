class IfClass{

public static void main(String arg[]){
boolean isMovieKantara=true;
boolean isGoodReview=true;
boolean isTamilSubtitle=true;
if(isMovieKantara){
    if(isGoodReview){
        if(isTamilSubtitle){
            System.out.println("Book Ticket");
        }   
        else{
            System.out.println("No Tamil Subtitle");
        }
    }
    else{
        System.out.println("Movie not Good");
    }
}
 else{
        System.out.println("Movie not Available");
 }
}
}
