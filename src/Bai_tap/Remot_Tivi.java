package Bai_tap;

public class Remot_Tivi {
    public static void main(String[] args) {

        Tivi tivi = new Tivi(2, 10);
        Remote remote = new Remote(6, tivi);


        tivi.turnOff();
        tivi.getStatus();
        System.out.println();
        System.out.print("Đang tại kênh : ");
        tivi.setChannel(7);
        System.out.println(tivi.getChannelTV());
        System.out.print("Âm lượng : ");
        System.out.println(tivi.getVolumeTV());

        System.out.println();
        System.out.print("Chuyển đến kênh :");
        remote.setChannel(3);
        remote.setVolume(12);
        System.out.println(tivi.getChannelTV());
        System.out.print("Âm lượng : ");

        System.out.println(tivi.getVolumeTV());
    }
}
class Remote {
    private int id;
    private Tivi tv;

    public Remote(int id, Tivi tv) {
        this.id = id;
        this.tv = tv;
    }

    public void setChannel(int channel) {
        this.tv.setChannel(channel);
    }

    public void setVolume(int volume) {
        this.tv.setVolume(volume);
    }
}

class Tivi {
    private int volume;
    private int channel;
    private boolean status;

    public Tivi(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public void getStatus() {
        if (this.status) {
            System.out.println("Ti vi đang bật");
        } else {
            System.out.println("Tivi đang tắt");
        }
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public int getChannelTV() {
        return this.channel;
    }

    public int getVolumeTV() {
        return this.volume;
    }

    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
}
