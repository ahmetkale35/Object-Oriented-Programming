public class Song {
    private String title;
    private String artist;
    private Album onAlbum;
    private int lenInSeconds;

    public Song(String title, String artist, Album onAlbum,int lenInSeconds) {
        this.title = title;
        this.artist = artist;
        this.onAlbum = onAlbum;
        this.lenInSeconds=lenInSeconds;
    }

    public Album getOnAlbum() {
        return onAlbum;
    }

    public boolean onSameAlbum(Song otherSong) {
        return this.onAlbum.equals(otherSong.getOnAlbum());
    }

}