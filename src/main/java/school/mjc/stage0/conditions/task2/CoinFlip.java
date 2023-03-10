package school.mjc.stage0.conditions.task2;

import java.util.concurrent.Callable;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        if(from1UpTo1000<500){
            System.out.println("Eagle");
        }
        else {
            System.out.println("Tail");
        }

    }

    public static void main(String[] args) {

CoinFlip coin=new CoinFlip();
coin.throwCoin(700);
coin.throwCoin(3);
coin.throwCoin(500);
    };

    }

