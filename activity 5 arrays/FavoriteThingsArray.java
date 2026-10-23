
public class FavoriteThingsArray {
    public static void main(String[] args) {

        String[] favorites = {
            "Cycling",
            "Music",
            "Motorcycles",
            "Food",
            "Technology"
        };

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total favorites: " + favorites.length);
    }
}
