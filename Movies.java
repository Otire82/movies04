import java.util.Arrays;

class Movies {

    public static void main(String...args) {
        String[] movies = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade", "Indiana Jones and the Kingdom of the Crystal Skull"};
        String[] firstActors = {"Harrison Ford", "Karen Allen", "Paul Freeman"};
        String[] secondActors = {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"};
        String[] thirdActors = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
        String[] fourthActors = {"Harrison Ford", "Cate Blanchett", "Shia LaBeouf"};
        String[][] movieActors;
        movieActors = new String[][]{firstActors, secondActors, thirdActors, fourthActors};

        for(int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film " + movies [i]+ ", les principaux acteurs sont " + (Arrays.toString(movieActors[i]).replaceAll("\\[|]", "")));
        }
    }
}