package ch05.ch0;
import java.util.*;
public class SortMountains {
    public static void main(String[] args){
        new SortMountains().go();
    }
    public void go() {
        List<Mountain> mountains = new ArrayList<>();
    }
}

class Mountain{
    private String name;
    private int height;

   Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }
     public String toString(){
       return name + height;
     }
}