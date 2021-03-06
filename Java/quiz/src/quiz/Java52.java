package quiz;

public class Java52 {
	public static void main(String[] args) {
		CoinCase2 coincase = new CoinCase2(1, 2, 4, 0, 8, 0);
		System.out.println(coincase.getSumCount());
		System.out.println(coincase.getPrice());

		int[] coins = new int[] {1, 10, 5, 100};
		coincase.inputCoins(coins);
		System.out.println(coincase.getSumCount());
		System.out.println(coincase.getPrice());
	}
}

class CoinCase2{
	int coin1, coin5, coin10, coin50, coin100, coin500;

	public int getSumCount() {
		return coin1 + coin5 + coin10 + coin50 + coin100 + coin500;
	}

	public int getPrice(){
		return coin1*1 + coin5*5 + coin10*10 + coin50*50 + coin100*100 + coin500*500;
	}

	public void inputCoins(int[] coins) {
		for(int i = 0; i < coins.length; i++) {
			switch(coins[i]) {
			case 1:
				coin1 += 1;
				break;
			case 5:
				coin5 += 1;
				break;
			case 10:
                coin10 += 1;
                break;
            case 50:
                coin50 += 1;
                break;
            case 100:
                coin100 += 1;
                break;
            case 500:
                coin500 += 1;
                break;
			}
		}
	}

	public CoinCase2(int coin1, int coin5, int coin10, int coin50, int coin100, int coin500) {
		this.coin1 = coin1;
		this.coin5 = coin5;
		this.coin10 = coin10;
	    this.coin50 = coin50;
	    this.coin100 = coin100;
	    this.coin500 = coin500;
	}
}
