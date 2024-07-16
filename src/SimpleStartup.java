import java.util.Arrays;

public class SimpleStartup {
    public static void main(String[] args){
        int[] locationCells;
        int[] location = {2, 3, 4};
        locationCells = location;
        System.out.println(Arrays.toString(locationCells));
    }
}
