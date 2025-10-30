public class BoohbahDanceTest{
    public static void main (String[] args){
        Boohbah booh1 = new Boohbah("Mr. McCuen","Break Dance");
        Boohbah booh2 = new Boohbah("Ms. Keller","Disco Finger");
        Boohbah booh3 = new Boohbah("Mr. Gardner","White Guy Shuffle");

        Boohbah[] boohs = {booh1,booh2,booh3};
        DanceRoutine boohDance = new DanceRoutine(boohs);

        System.out.println("Original Routine:");
        System.out.println(boohDance.buildRoutine());

        System.out.println("Modified Routine:");
        System.out.println(boohDance.modifyRoutine());

        System.out.println("Remixed Routine:");
        System.out.println(boohDance.remixRoutine());
    }
}
