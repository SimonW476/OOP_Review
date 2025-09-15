//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Monster {
            private int health = 100;
            private int damage = 10;

            public int getDamage() {
                return damage;
            }
            public void setDamage(int damage) {
                this.damage = damage;
            }
            public int getHealth() {
                return health;
            }
            public void setHealth(int health) {
                this.health = health;
            }

            static void attack(Monster target) {

            }

            static void speak() {
                System.out.println("Speaking");
            }

            static void die() {
                
            }

        }




        class Vampire extends Monster {

        }
        class Dragon extends Monster {

        }

    }

    }
