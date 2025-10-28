public class DanceRoutine{
    private Boohbah[] boohbahs;
    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }
    public String buildRoutine(){
        StringBuilder booh_moves = new StringBuilder("");
        for (Boohbah boohbah:boohbahs){
            booh_moves.append(boohbah.performMove()+"\n");
        }
        String moves = booh_moves.toString();
        return moves;
    }

    public String modifyRoutine(){
        StringBuilder booh_moves = new StringBuilder("");
        for (Boohbah boohbah:boohbahs){
            booh_moves.append(boohbah.performMove()+"\n");
        }
        String moves = booh_moves.toString();
        moves = moves.replace("performs","dances to");
        return moves;
    }
}
