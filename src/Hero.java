public class Hero {
    private int healthOfHero;
    private int damageOfHero;
    private String superpowersOfHero;
    public Hero(int healthOfHero, int damageOfHero, String superpowersOfHero){
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
        this.superpowersOfHero = superpowersOfHero;
    }

    public Hero(int healthOfHero, int damageOfHero){
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
    }

    public int getHealthOfHero() {
        return healthOfHero;
    }

    public int getDamageOfHero() {
        return damageOfHero;
    }

    public String getSuperpowersOfHero() {
        return superpowersOfHero;
    }

    public void setSuperpowersOfHero(String superpowersOfHero) {
        this.superpowersOfHero = superpowersOfHero;
    }
}
