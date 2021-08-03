package com.company;

//1. & 2.
abstract class pen {
    abstract void refill();
    abstract void write();
}
class pen1 extends pen {
    @Override
    void refill() {
        System.out.println("Refilling the pen");
    }
    @Override
    void write() {
        System.out.println("Writing....");
    }
    void changeNib(){
        System.out.println("Changing the Nib...");
    }
}


//3.
class Monkey {
    void jump(){
        System.out.println("Monkey is jumping...");
    }
    void bite(){
        System.out.println("Minkey is biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello....");
    }
    void watchTV(){
        System.out.println("Watching TV.");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping....");
    }
}


//4.
abstract class Phone {
    abstract void pickPhone();
    abstract void ringPhone();
    abstract void endCall();
}

interface GPS{
    void tracking();
    void location();
}

interface camera{
    void clickPic();
    void recordVideo();
}

interface playGame{
    void game();
    void pubg();
}

class SmartPhone extends Phone implements GPS,camera,playGame{

    @Override
    void pickPhone() {
        System.out.println("Picking Phone...");
    }

    @Override
    void ringPhone() {
        System.out.println("Phone is ringing...");
    }

    @Override
    void endCall() {
        System.out.println("Disconnected");
    }

    @Override
    public void tracking() {
        System.out.println("Tracking Phone..");
    }

    @Override
    public void location() {
        System.out.println("Finding Location...");
    }

    @Override
    public void clickPic() {
        System.out.println("Clicking picture.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video.");
    }

    @Override
    public void game() {
        System.out.println("Playing Game...");
    }

    @Override
    public void pubg() {
        System.out.println("Playing PUBG");
    }
}


//6.
interface remote {
    void upChannel();
    void downChannel();
    void upVolume();
    void downVolume();
}

interface smartRemote extends remote {
    void changeScreen();
}


//7.
class TVRemote implements smartRemote {
    @Override
    public void upChannel() {
        System.out.println("Channel Changed..");
    }

    @Override
    public void downChannel() {
        System.out.println("Channel Changed..");
    }

    @Override
    public void upVolume() {
        System.out.println("Volume up...");
    }

    @Override
    public void downVolume() {
        System.out.println("Volume down");
    }

    @Override
    public void changeScreen() {
        System.out.println("Screen Changed...");
    }
}

public class Practice11_Interface {
    public static void main(String[] args) {


//        1. & 2.
        pen1 p = new pen1();
        p.refill();
        p.write();
        p.changeNib();


//        3.
        Human Abhay = new Human();
        Abhay.eat();
        Abhay.sleep();
        Abhay.watchTV();
        Abhay.speak();
        Abhay.bite();
        Abhay.jump();


//        4.
        SmartPhone mi = new SmartPhone();
        mi.clickPic();
        mi.endCall();
        mi.game();
        mi.location();
        mi.pickPhone();
        mi.recordVideo();
        mi.ringPhone();


//        5.
        Monkey Ashu = new Human();
        Ashu.bite();
        Ashu.jump();


//        6. & 7.
        TVRemote remote = new TVRemote();
        remote.changeScreen();
        remote.downChannel();
        remote.upChannel();
        remote.upVolume();
        remote.downVolume();




    }
}
