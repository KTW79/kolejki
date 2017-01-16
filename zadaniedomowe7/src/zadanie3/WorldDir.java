package zadanie3;

/**
 * Created by Kasia on 16.01.2017.
 */
public enum WorldDir {
    NORTH("północ"),
    SOUTH("południe"),
    EAST("wschód"),
    WEST("zachód");



    private final String directioname;

    public String getDirectioname() {
        return directioname;
    }

    WorldDir(String directioname) {
        this.directioname = directioname;
    }

    public void printdirectionname(){
        System.out.println(this.directioname);
    }
}
