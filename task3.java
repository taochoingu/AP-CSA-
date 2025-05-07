import java.util.*;
import java.util.ArrayList;

class ProductReview{
  private String name;
  private String review;
  public ProductReview(String pName,String pReview){
    name = pName;
    review = pReview;
  }
  public String getName(){
    return name;
  }
  public String getReview(){return review;}
}
public class ReviewCollector{
  private ArrayList<ProductReview> reviewList;
  private ArrayList<String> productList;
  public ReviewCollector(){
    reviewList = new ArrayList<ProductReview>();
    productList = new ArrayList<String>();
  }
  public void addReview(ProductReview prodReview){
    reviewList.add(prodReview);
    if(productList.indexOf(prodReview.getName())==-1) productList.add(prodReview.getName());
}
  public int getNumGoodReview(String prodName){
    int c = 0;
    for(ProductReview x : reviewList){
      if(x.getReview().indexOf("best") != -1 && x.getName().equals(prodName)) c++;
    }
    return c;
  }
}
