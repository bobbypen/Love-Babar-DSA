package Arrays;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []	prices = {2,4,1};
	
	
	  int maxProfits = 0;
      int currentPrice = prices[0];

      for(int i = 1; i < prices.length; i++){
          if(currentPrice < prices[i]){
              maxProfits = Math.max(maxProfits, prices[i]-currentPrice);
          }else{
              currentPrice = prices[i];
          }
      }

      System.out.println(maxProfits);
		
		
	}

}
