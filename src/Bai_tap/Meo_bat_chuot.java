package Bai_tap;

import java.util.Scanner;

public class Meo_bat_chuot {
    public void meoBatChuot(Cat cat, chuot mouse) {
        if (cat.speed_cat > mouse.speed_mouse) {
            System.out.println("Cat caught the mouse");
            cat.mass_cat = mouse.mass + cat.mass_cat;
            System.out.println("New mass of cats : " + cat.mass_cat);
            System.out.println("Mouse was eaten by the cat");
        } else {
            System.out.println("Cat no caught the mouse");
            System.out.println("The mass of the cat does not change");
            System.out.println("Mouse has escaped");
        }
    }

    //    public void MeoNoChuot(Cat cat, chuot mouse) {
//        if (cat.speed_cat > mouse.speed_mouse) {
//            System.out.println("Mouse was eaten by the cat");
//        } else {
//            System.out.println("Mouse has escaped");
//        }
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mass_Cat : ");
        int mass_cat = input.nextInt();

        System.out.print("Speed_Cat : ");
        int speed_cat = input.nextInt();
        chuot chuot_1 = new chuot("Rat", 10, 30);
        chuot_1.noDie();
        Cat cat = new Cat("Tom", mass_cat, speed_cat, chuot_1);

        Meo_bat_chuot meoBatChuot = new Meo_bat_chuot();
        System.out.println("-------------");
        meoBatChuot.meoBatChuot(cat, chuot_1);
    }
}

class chuot {
    String name;
    double mass; // khối lượng
    double speed_mouse;// tốc độ
    boolean Status;
    String sound_chuot;//âm thanh

    public chuot(String name, int mass, double speed) {
        this.name = name;
        this.mass = mass;
        this.speed_mouse = speed;
    }

    //    public String getStatus(){
//        if (this.Status){
//            return "chuột sống";
//        }else {
//            return "chuột chết";
//        }
//    }
    public boolean Die() {
        return this.Status = false;
    }

    public boolean noDie() {
        return this.Status = true;
    }

    public void actionMouse(String sound) { // hành động
        this.sound_chuot = sound;
        System.out.println(this.sound_chuot);
    }
}

class Cat {
    String name_cat;
    double mass_cat; // khối lượng
    double speed_cat;// tốc độ tối đa
    String sound_Cat, mouse;//âm thanh


    public Cat(String name, int mass, double speed, chuot mouse) {
        this.name_cat = name;
        this.mass_cat = mass;
        this.speed_cat = speed;
    }

    public double getMassCat() {
        return this.mass_cat;
    }

    public void setSoundCat(String sound_Cat) {
        this.sound_Cat = sound_Cat;
    }

    public String getSoundCat() {
        return this.sound_Cat;
    }

    public String actionCat(String sound) {
        this.sound_Cat = sound;
        return this.sound_Cat;
    }
}
