package object_oriented_program.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static ArrayList<Stock> stockList = new ArrayList<Stock>();
    static void printStocks(){
        System.out.println("Stocks");
        System.out.println("____________");
        System.out.println("");
        for(int i=0; i<stockList.size();i++){
           System.out.println("Stock Name: " + stockList.get(i).stockName);
           System.out.println("Share Price: " + stockList.get(i).sharePrice);
           System.out.println("Number of Shares: " + stockList.get(i).numberOfShares);
            System.out.println("Total share price: " + stockList.get(i).totalSharePrice);
           System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of stocks");
        int numberOfStocks = scan.nextInt();

        for(int i=0; i<numberOfStocks; i++){
         System.out.println("Enter the Stock Name");
         String stockName = scan.next();

         System.out.println("Enter the Share Price");
         int sharePrice = scan.nextInt();

         System.out.println("Enter the Number of Share");
         int shareNumber = scan.nextInt();

         Stock stockInstance = new Stock(stockName,sharePrice,shareNumber);
         stockInstance.calculateTotalPrice();
         stockList.add(stockInstance);
        }
        printStocks();
    }
}
