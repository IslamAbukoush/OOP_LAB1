package org.example.task3;

import org.example.task1.Display;

import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDispalys;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDispalys = new ArrayList<Display>();
    }
    public Assistant(String assistantName, List<Display> assignedDisplays) {
        this.assistantName = assistantName;
        this.assignedDispalys = assignedDisplays;
    }
    public void assignDisplay(Display display) {
        this.assignedDispalys.add(display);
    }
    public void assist() {
        for(Display display : this.assignedDispalys) {
            for(Display compareDisplay : this.assignedDispalys) {
                if(display == compareDisplay) continue;
                System.out.println("==========" + display.getModel() + " VS " + compareDisplay.getModel() + "==========");
                display.compareWithMonitor(compareDisplay);
                System.out.println('\n');
            }
        }
    }
    public Display buyDisplay(Display display) {
        this.assignedDispalys.remove(display);
        return display;
    }
}
