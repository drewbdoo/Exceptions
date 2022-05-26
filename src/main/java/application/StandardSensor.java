package application;

public class StandardSensor implements Sensor {

    private int num;
    private boolean onOff;
    public StandardSensor(Integer num){
        this.num=num;
        this.onOff=true;

    }


    @Override
    public boolean isOn() {
        return onOff;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return num;
    }
}
