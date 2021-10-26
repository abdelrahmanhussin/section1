package tv;
public class TV 
{
    int channel = 1; // channel from 1 to 120
    int volumeLevel = 1; // volume level from 1 to 7 
    boolean on;
    TV(){};
    void turnOn()
    {
        on = true;
    };
    void turnOff()
    {
        on = false;
    };
    void setChannel(int newChannel)
    {
        if( on && newChannel >= 1 && newChannel <= 120 )
        {
            channel = newChannel;
        }
    };
    void setVolume(int newVolumeLevel)
    {
        if( on && newVolumeLevel >= 1 && newVolumeLevel <= 7 )
        {
            volumeLevel = newVolumeLevel;
        }
    };
    void channelUp()
    {
        if( on && channel < 120 )
        {
            channel++;
        }
    };
    void channelDown()
    {
        if( on && channel > 1)
        {
            channel--;
        }
    };
    void volumeUp()
    {
        if( on && volumeLevel < 7 )
        {
            volumeLevel++;
        } 
    };
    void volumeDown()
    {
        if( on && volumeLevel > 1 )
        {
            volumeLevel--;
        } 
    };
    public static void main(String[] args) 
    {
        TV t1 = new TV();
        t1.turnOn();
        t1.setChannel(25);
        t1.setVolume(5);
        t1.channelUp();
        t1.volumeUp();
        
        TV t2 = new TV();
        t2.turnOn();
        t2.setChannel(70);
        t2.setVolume(4);
        t2.channelDown();
        t2.volumeDown();
        
        System.out.println("First TV channel is :" + t1.channel + " and volume level is :" + t1.volumeLevel);
        System.out.println("Second TV channel is :" + t2.channel + " and volume level is :" + t2.volumeLevel);
    }
}
