package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean onOff;


    public TemperatureSensor(){
        this.onOff = false;
    }

    @Override
    public boolean isOn() {
        return onOff;
    }

    @Override
    public void setOn() {
        onOff=true;

    }

    @Override
    public void setOff() {
        onOff=false;

    }

    @Override
    public int read() {
        if(onOff){
            return new Random().nextInt(61)-30;
        }else{
           throw new IllegalStateException("Temperature Sensor is off");
        }

    }
}
