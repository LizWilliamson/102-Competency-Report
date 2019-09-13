public class Game{

    public static void main(String args[]){

        System.out.println("*********** Welcome to my ZombieLand Video Game ************");

        Character Liz = new Character("Liz (L)", 3, 100, 25, 5);
        Character Zombie = new Character ("Zombie (Z)", 3, 100, 50, 4);
        //Liz.printCharacter();
        //Zombie.printCharacter();

        Liz.attack(Zombie);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        Liz.attack(Zombie);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        Zombie.attack(Liz);
        



    }
}