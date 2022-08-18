import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Time is dancing");
      desertIslandPlaylist.add("Slow dancing in a burning room");
        desertIslandPlaylist.add("CREEKS");
          desertIslandPlaylist.add("22 Strafford apts");
            desertIslandPlaylist.add("Pink matter");
              desertIslandPlaylist.add("Numb");

 desertIslandPlaylist.remove("Time is dancing");
    System.out.println(desertIslandPlaylist);

    
    String songA = desertIslandPlaylist.get(1);
    String songB = desertIslandPlaylist.get(3);
    String temp = songA;

    desertIslandPlaylist.set(1, songB);
    desertIslandPlaylist.set(3, songA);


System.out.println(desertIslandPlaylist)
;  }
  
}