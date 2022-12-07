package object_oriented_program.stock;

public class Stock {

    Stock(String stockName, double sharePrice, int numberOfShares){  // arguments passed when creating the instance.
       this.stockName = stockName;
       this.sharePrice = sharePrice;
       this.numberOfShares = numberOfShares;
    }
    String stockName;           // instance variables
    double sharePrice;
    int numberOfShares;
    double totalSharePrice;

    void calculateTotalPrice(){
        this.totalSharePrice = this.sharePrice * this.numberOfShares;
    }
}




