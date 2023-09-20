package schladek;

import java.net.MalformedURLException;
import java.net.URL;

public class Worteintrag {
    private String wort, url;
    public Worteintrag(String wort, String url) {
        if(wort.length() > 2) {
            this.wort = wort;
            this.url = url;
        } else {
            throw new IllegalStateException("Bitte ein längeres Wort übergeben: ");
        }
    }
    public static boolean checkURL(String url) {
        try {
            new URL(url);
            return true;
        } catch(MalformedURLException m) {
            return false;
        }
    }

    public String getWort() {
        return wort;
    }

    public void setWort(String wort) {
        if(wort.isEmpty()) {
            throw new IllegalArgumentException("Bitte ein gültiges Wort übergeben: ");
        } else {
            this.wort = wort;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(url.isEmpty()) {
            throw new IllegalArgumentException("Bitte eine gültige URL übergeben: ");
        } else {
            this.url = url;
        }
    }

    @Override
    public String toString() {
        return wort + ";" + url;
    }
}