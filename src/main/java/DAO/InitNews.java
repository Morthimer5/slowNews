package DAO;

import model.News;

import java.util.ArrayList;
import java.util.HashMap;

public class InitNews {
    private static int currentID = 0;
    
    public static void initNews(){
        NewsContainer.setNews(new News("Scientists just found...", ("Not to blow your mind but the universe " +
                "might actually be a hologram. Or that's one hypothesis being tested by scientists in " +
                "America. Theoretical physicist Juan Maldacena first proposed the holographic principle " +
                "in 1997. Essentially it suggests life as we know it could be an optical illusion created " +
                "by light defraction.Researchers at America's Fermi National Laboratory in Illinois explain " +
                "it in slightly simpler terms, saying \"much like characters on a television show would not " +
                "know that their seemingly 3D world exists only on a 2D screen, we could be clueless that " +
                "our 3D space is just an illusion. So to find out if we are actually living in a hologram," +
                " scientists are (metaphorically) trying to get close enough to the TV screen to see its " +
                "pixels using a (real) contraption called the Holometer. As Craig Hogan, the director of " +
                "Fermilab’s Center for Particle Astrophysics said somewhat unnecessarily: \"If we see " +
                "something, it will completely change ideas about space we’ve used for thousands of years.\""),
                "Scients.jpg", currentID++));

        NewsContainer.setNews(new News("WattUp Can Wirelessly Charge Devices From 15 Feet Away",
                "While wireless charging has been with us in consumer form since the Powermat debuted " +
                        "in 2009, current evolution of the technology still sees us tethered to the charging pad. There are, " +
                        "however, a handful of efforts seeking to liberate us from this current predicament and the WattUp " +
                        "appears to be one of the most likely to find success. Made by Energous, it’s a wireless charging " +
                        "system that uses a mix of Bluetooth, RF signals, and some patent-pending tech to enable sending " +
                        "power wirelessly to devices as far as 15 feet away. That way, you just have to be within the vicinity " +
                        "of the charging device (which, in this case, looks and functions like a bigger WiFi router) in order " +
                        "to get your phones, tablets, and similar gadgets juiced. The WattUp can work with any battery-operated " +
                        "device that requires less than 10 watts to charge. While that probably rules any current generation " +
                        "of laptops, it should be enough for mobile phones, tablets, and other mobile gadgets. It uses a " +
                        "transmitter called the Power Router, which sends the energy via RF signal to a WattUp receiver " +
                        "pre-installed in the device, which then converts the signal into battery power. Up to 12 receivers " +
                        "can be managed by the Power Router simultaneously, continuously charging them even while the gadgets " +
                        "are in motion, provided they stay within range. As of now, Energous is working on licensing their " +
                        "technology to other companies who can then integrate it into their own products. They’re releasing a " +
                        "reference design for both the transmitter and the receiver in around six months, which licensees can " +
                        "then use to pattern their own charging systems. Energous expects WattUp to appear in consumer products " +
                        "as early as 2016.", "Money.jpg",  currentID++));

        NewsContainer.setNews(new News("SlowNews Are Here", "We're open!", "slowpoke.jpg", currentID++));

    }

}
