package enumdemo;

import enumdemo.WaterTankAlarm;
import controlflow.SwitchDemo;

public class MainForAlarmSwitch {
    public static void main(String[] args) {
        WaterTankAlarm obj=new WaterTankAlarm();
        //obj.ControlWaterFlow();
        // SwitchDemo obj2=new SwitchDemo();
        //obj2.moodDetector();
        SwitchDemo obj3=new SwitchDemo();
        obj3.SwitchLoop();
        NestedIfElse obj4 =new NestedIfElse();
        obj4.nestedIfElse();
    }
}
