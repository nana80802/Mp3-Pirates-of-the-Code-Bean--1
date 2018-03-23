package at.refugeescode.Mp3PiratesoftheCodeBean1;

import org.springframework.stereotype.Component;

@Component
public class Compass {
    private Coin coin;

    public Compass(Coin coin) {
        this.coin = coin;
    }

    public Coin findCoin() {
        return coin;

    }
}
