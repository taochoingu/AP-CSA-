import java.util.*;

class Seat{
  private boolean available;
  private int tier;
  public Seat(boolean isAvail, int tierNum){
    available = isAvai;
    tier = tierNum;
  }
  public boolean isAvailable(){
    return available;
  }
  public int getTier(){
    return tier;
  }
  public void setAvailability(boolean isAail){
    available =isAvail;
  }
}
public class Theater{
  private Seat[][] theaterSeats;
  public Theater(int seatsPerRow,int tier1Rows,int tier2Rows){//a
    theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];
    for(int i =0; i < theaterSeats.length;i++){
     for(int j =0;j<theaterSeats[0].length;j++){
       if(i<tier1Rows) theaterSeats[i][j] = new Seat(true,1);
       else theaterSeats[i][j] = new Seat(true,2);
     }
    }
  }
  public boolean reassignSeat(int fromRow,int fromCol,int toRow,int toCol){//b
    if(theaterSeats[toRow][toCol].isAvailable && theaterSeats[toRow][toCol].getTier<= theaterSeats[toRow][toCol].getTier[fromRow][fromCol]){
      theaterSeats[fromRow][fromCol].setAvailability(true);
      theaterSeats[toRow][toCol].setAvailability(false);
      return true;
    }
    return false;
  }
}
