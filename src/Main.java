public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setTypeOfDefence("Kinetic");
        System.out.println("Boss damage is: " + boss.getDamage() + ", health is: " + boss.getHealth()
                + ", type of defence: " + boss.getTypeOfDefence());

        Hero[] heroesList = createHeroes();
        for(Hero h : heroesList){
            System.out.println("Hero's superpower is: " + h.getSuperpowersOfHero() + ", damage is: " + h.getDamageOfHero()
                       + ", health is: " + h.getHealthOfHero());
        }

    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(200, 40, "Kinetic");
        Hero hero2 = new Hero(300, 45);
        hero2.setSuperpowersOfHero("Physical");
        Hero hero3 = new Hero(250, 55, "Magical");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }




}