package stuff;

public class Main {

    public static void main(String[] args) {

        GroundGrunt grunt = new GroundGrunt();
        System.out.println(grunt.speak());
        System.out.println(grunt.march());
        System.out.println(grunt.sleepyTime());
        System.out.println(grunt.stuffFace());

        ArtilleryGrunt artilleryGrunt = new ArtilleryGrunt();
        System.out.println(artilleryGrunt.fireRPG());
        System.out.println(artilleryGrunt.antiAA());
        System.out.println(artilleryGrunt.dropnuke());


    }

}
