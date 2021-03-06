package quiz;

public class Java51 {
	public static void main(String[] args) {
		CoinCase coincase = new CoinCase(1, 2, 4, 0, 8, 0);
		System.out.println(coincase.getSumCount());
		System.out.println(coincase.getPrice());
	}
}

class CoinCase{
	int coin1, coin5, coin10, coin50, coin100, coin500;

	public int getSumCount() {
		return coin1 + coin5 + coin10 + coin50 + coin100 + coin500;
	}

	public int getPrice(){
		return coin1*1 + coin5*5 + coin10*10 + coin50*50 + coin100*100 + coin500*500;
	}

	public CoinCase(int coin1, int coin5, int coin10, int coin50, int coin100, int coin500) {
		this.coin1 = coin1;
		this.coin5 = coin5;
		this.coin10 = coin10;
	    this.coin50 = coin50;
	    this.coin100 = coin100;
	    this.coin500 = coin500;
	}
}