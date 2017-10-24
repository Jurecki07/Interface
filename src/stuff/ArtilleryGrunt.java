package stuff;

 public class ArtilleryGrunt extends Soldier implements Artillery {


    @Override
    public String fireRPG() {
        return null;
    }
     public String dropnuke(){
         return "Nuke is dropped";
     }
     public String antiAA(){
         return  "Anti  Aircraft rounds live";
     }

}
