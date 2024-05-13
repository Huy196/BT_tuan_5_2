package Bai_tap;

public class flashlight {
    public static void main(String[] args) {
        ElectricLamp electricLamp_1 = new ElectricLamp(false);
        SwitchButton switchButton_1 = new SwitchButton(false, electricLamp_1); // Kết nối giữa công tắc 1 và đèn 1

        for (int i = 1; i < 4; i++) {
            System.out.println(switchButton_1.switchOn());
            System.out.println(electricLamp_1.getStatus());
            System.out.println(switchButton_1.switchOff());
            System.out.println(electricLamp_1.getStatus());
        }
    }

}

class ElectricLamp { // đèn điện
    boolean status;

    public ElectricLamp(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}

class SwitchButton {
    boolean status;
    ElectricLamp lamp;

    public SwitchButton(boolean status, ElectricLamp lamp) {
        this.lamp = lamp;
        this.status = status;
    }

    public ElectricLamp getLamp() {
        return this.lamp;
    }

    public void setLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void connectToLamp(ElectricLamp electricLamp) {
        this.lamp = electricLamp;
    }

    public boolean switchOff() {
        this.lamp.status = false;
        this.status = true;
        return this.status;
    }

    public boolean switchOn() {
        this.lamp.status = false;
        this.status = true;
        return this.status;
    }
}

