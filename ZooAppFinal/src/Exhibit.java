/**
 * Created by Matthew.Watson on 10/13/16.
 */
public enum Exhibit { //yeah I can't get this to work.
    MAMMAl("Mammal Mountain"),
    BIRD("BIRDS BIRDS BIRDS"),
    FISH("The Pond");

    String exhibitNum;

    Exhibit(String exhibitNum) {
        this.exhibitNum=exhibitNum;
    }

    public String getExhibitNum(){
        return exhibitNum;
    }
}
