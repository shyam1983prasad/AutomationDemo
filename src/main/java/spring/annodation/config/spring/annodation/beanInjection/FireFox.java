package spring.annodation.config.spring.annodation.beanInjection;

/**
 * Created by muthuselvan on 10/28/17.
 */
public class FireFox {

    private FireFoxProfile fireFoxProfile ;
    public FireFox(FireFoxProfile fireFoxProfile) {
        this.fireFoxProfile = fireFoxProfile;
    }

    public void loadprofile() {
        fireFoxProfile.loadfirefoxprofile();
    }
}
