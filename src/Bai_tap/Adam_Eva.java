package Bai_tap;

public class Adam_Eva {
    private int weight;


    public void getInfo(Human human) {
        System.out.println(human.name + " " + human.weight + " " + human.getGender());
    }

    public static void main(String[] args) {
        Human adam = new Human("adam", true, 65);
        Human eva = new Human("eva", false, 85);
        Apple apple_1 = new Apple(10);

        adam.say("I am Adam" + "\n");
        eva.say("I am Eva" + "\n");

        while (apple_1.isEmpty() != true) {
            System.out.println("Adam ăn táo ");
            adam.eat(apple_1);
            System.out.print("Quả táo còn : ");
            System.out.println(apple_1.getWeight() + " đơn vị ");
            System.out.println("cân nặng của Adam là : " + adam.getWeight() + " đơn vị ");
            System.out.println();

            System.out.println("Eva ăn táo ");
            eva.eat(apple_1);
            System.out.print("Quả táo còn : ");
            System.out.println(apple_1.getWeight() + " đơn vị ");
            System.out.println("cân nặng của Eva là : " + eva.getWeight() + " đơn vị ");
            System.out.println();

        }
    }

}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isEmpty() {
        if (this.weight <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void decreaApple() {
        if (this.isEmpty()) {
            System.out.println("Táo đã hết rồi!");
        } else {
            this.weight--;
        }
    }
}

class Human {
    String name;
    boolean gender;
    int weight;

    public Human(String name, boolean gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isMale() {
        if (isMale()) {
            return true;
        } else {
            return false;
        }
    }

    public String getGender() {
        if (this.isMale()) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void say(String string) {
        System.out.println();
    }

    public void eat(Apple apple) {
        if (apple.getWeight() > 0) {
            apple.decreaApple();
            this.weight++;
        } else {
            System.out.println("Táo đã hết");
        }
    }

    public boolean checkApple(Apple apple, Human human) {
        return apple.isEmpty();
    }
}