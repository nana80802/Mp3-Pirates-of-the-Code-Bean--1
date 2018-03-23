package at.refugeescode.Mp3PiratesoftheCodeBean1;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {
    private Compass compass;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public Coin findCoin(){
        Coin coin = compass.findCoin();
        return coin;

    }
}
