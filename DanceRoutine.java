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

    public String remixRoutine(){
        StringBuilder booh_moves = new StringBuilder(buildRoutine());
        booh_moves.insert(0,"---REMIX---\n");
        int count = booh_moves.length() - 1;
        booh_moves.delete(count,count);
        booh_moves.append("( Backwards Boohbah Shuffle )");
        booh_moves.reverse();
        String moves = booh_moves.toString();
        return moves;
    }
}
