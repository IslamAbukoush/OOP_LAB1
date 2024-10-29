package org.example.task1;

public class Display {
    private int width;
    private int height;
    private int ppi;
    private String model;

    public Display(int width, int height, int ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        if(this.width*this.height > m.width*this.height) {
            System.out.println(this.model + " has higher resolution than " + m.model);
        } else if (this.width*this.height < m.width*this.height) {
            System.out.println(this.model + " has lower resolution than " + m.model);
        } else {
            System.out.println(this.model + " has same resolution as " + m.model);
        }
    }

    public void compareSharpness(Display m) {
        if(this.ppi > m.ppi) {
            System.out.println(this.model + " has higher sharpness than " + m.model);
        } else if (this.ppi < m.ppi) {
            System.out.println(this.model + " has lower sharpness than " + m.model);
        } else {
            System.out.println(this.model + " has same sharpness as " + m.model);
        }
    }

    public void compareWithMonitor(Display m) {
        this.compareSize(m);
        this.compareSharpness(m);
    }
}
