public class Boohbah{
    private String name;
    private String danceMove;

    public Boohbah(String name, String danceMove){
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getName(){
        return name;
    }

    public String getMove(){
        return danceMove;
    }

    public String performMove(){
        return name + " performs " + danceMove;
    }
}
