package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private boolean onOff;

    private Sensor sensors;
    private List<Integer> readings;

    ArrayList<Sensor> allSensors;

    public AverageSensor() {
        allSensors = new ArrayList<>();
        readings = new ArrayList<>();


    }


    public void addSensor(Sensor toAdd) {
        allSensors.add(toAdd);
        onOff=true;

    }

    @Override
    public boolean isOn() {
        return onOff;
    }

    @Override
    public void setOn() {
        allSensors.forEach(Sensor::setOn);

    }

    @Override
    public void setOff() {
        this.allSensors.forEach(Sensor::setOff);

    }

    @Override
    public int read() {
        if (!onOff || allSensors.isEmpty()) {
            throw new IllegalStateException("All sensors are off");
        }
        else{
            int total =0;
            int averageTotal = 0;
            for (int i = 0; i < allSensors.size(); i++) {

                total += allSensors.get(i).read();

            }
            averageTotal = total / allSensors.size();
            readings.add(averageTotal);
            return  averageTotal;
        }
    }

    public List<Integer> readings(){
        return readings;

    }

}






