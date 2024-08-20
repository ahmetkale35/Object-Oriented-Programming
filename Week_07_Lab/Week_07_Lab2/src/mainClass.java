public class mainClass {
	public static void main(String[] args) {

		Album album1 = new Album("Artist1", "Rock");
		Album album2 = new Album("Artist2", "Pop");

		Song song1 = new Song("Song1", "Artist1", album1, 180);
		Song song2 = new Song("Song2", "Artist1", album1, 200);
		Song song3 = new Song("Song3", "Artist2", album2, 150);

		System.out.println("Album 1 has Rock music: " + album1.hasRockMusic()); // true
		System.out.println("Album 2 has Rock music: " + album2.hasRockMusic()); // false

		System.out.println("Song1 and Song2 are on the same album: " + song1.onSameAlbum(song2)); // true
		System.out.println("Song1 and Song3 are on the same album: " + song1.onSameAlbum(song3)); // false
	}
}
