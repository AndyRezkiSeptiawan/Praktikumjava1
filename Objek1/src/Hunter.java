public class Hunter {

    //attribute
    String username;
    int score;
    double length;


    //behavior
    void killBeast(){
        System.out.println("Mine..Mine..!");
    }

    void killHunter(Hunter hunter){
        score += 500;
    }

    public void killHunter() {
    }
}
