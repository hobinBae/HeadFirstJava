package ch05;
import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        //locationCells 안에 userInput이 있다면 그 해당 인덱스를 반환하고 없다면 -1을 반환한다.

        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }


        return result;
    }

}
