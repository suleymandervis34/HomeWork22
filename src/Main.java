public class Main {
    public static void main(String[] args) {
        Boss villain = new Boss();
        villain.setDemege(50);
        villain.setHealth(700);
        villain.setDefense("Magic shield");

        System.out.println("Boss : " );
        System.out.println(" Health: " + villain.getHealth() + " Damage: " + " Protection: " + villain.getDefense());


        Hero[] heroes = createHeroes();
        System.out.print("Information about heroes: ");
        for (Hero hero: heroes) {
            System.out.println("Health; " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamege());
            System.out.println("Super power: " + hero.getSuperPaver());
        }
    }


    public static Hero[] createHeroes (){
        Hero hero1 = new Hero(200,15,"Healing");
        Hero hero2 = new Hero(250,20);
        Hero hero3 = new Hero(300,25);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}