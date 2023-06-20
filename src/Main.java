import java.util.Arrays;

public class Main {
    /*ДЗ:
Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и сеттеры для всех полей.
В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй). Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes Hero[ ]
Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл. */
    public static void main(String[] args) {
        Boss darkLord = new Boss(435, 44, "Magical");

        System.out.println("BOSS HEALTH: " + darkLord.getHealth() + " BOSS DAMAGE" + darkLord.getDamage() + " BOSS DEFENCE TYPE: " + darkLord.getDefenceType());
        createHeroes();
        System.out.println();
        Hero[] heroArray = createHeroes();
        for (int i = 0; i < heroArray.length; i++) {
            System.out.println("Hero № " + (i + 1) + ": " + " Hero HEALTH: " + heroArray[i].getHealth() +
                    " Herro Damage: " + heroArray[i].getDamage() + " Hero superPower: " + heroArray[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero firstHero = new Hero(100, 56, "fireBall");
        Hero secondHero = new Hero(187, 44);
        Hero thirdHero = new Hero(190, 45);
        Hero[] heroArray = {firstHero, secondHero, thirdHero};
        return heroArray;
    }

}