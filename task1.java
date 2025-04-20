import java.util.*;
import java.lang.Math;
public class GameSpinner
{
    private int sector;
    private int currentRun;
    private int previous;
    private int current;
    public GameSpinner(int sector){
      this.sector= sector;
      current = 0;
      previous = 0;
      currentRun = 0;
    }
    public int currentRun(){
      return currentRun;
    }
    public int spin(){
      current = (int) (Math.random()*this.sector) + 1;
      if (current == previous){
        currentRun++;
      }
      else{
        previous = current;
        currentRun =1;
      }
      return current;
    }
} 
