import java.util.ArrayList;

public class Soul implements Music{

    private ArrayList<String> library = new ArrayList <String>();
    private String song = "";

    @Override
    public void addmusic(String songname, String artist){
        song = songname + " : " + artist;
        library.add(song);

    }
    @Override
    public void getmusic(){

        for(String x: library){
            System.out.println(x);
        }
        System.out.println("\n--------------------------------------------\n");


}
}
