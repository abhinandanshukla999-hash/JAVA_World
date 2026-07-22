

abstract class Car
{
    public abstract void engine();
    public abstract void musicplayer();
    public void color()
    {
        System.out.println("Color is: Black");
    }
}

abstract class Accord extends Car
{
    public void engine()
    {
        System.out.println("Engine is: 1850 cc");
    }
}

class WRV extends Accord
{
    public void musicplayer()
    {
        System.out.println("Music Player is: JBL");
    }
}

class xyz
{
    public static void main(String[] args)
    {
        WRV obj = new WRV();
        obj.engine();
        obj.musicplayer();
        obj.color();

    }
}