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

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPpi() {
        return ppi;
    }

    public String getModel() {
        return this.model;
    }

    public void compareSize(Display m) {
        if(this.width*this.height > m.getWidth()*m.getHeight()) {
            System.out.println(this.model + " has higher resolution than " + m.getModel());
        } else if (this.width*this.height < m.getWidth()*m.getHeight()) {
            System.out.println(this.model + " has lower resolution than " + m.getModel());
        } else {
            System.out.println(this.model + " has same resolution as " + m.getModel());
        }
    }

    public void compareSharpness(Display m) {
        if(this.ppi > m.getPpi()) {
            System.out.println(this.model + " has higher sharpness than " + m.getModel());
        } else if (this.ppi < m.getPpi()) {
            System.out.println(this.model + " has lower sharpness than " + m.getModel());
        } else {
            System.out.println(this.model + " has same sharpness as " + m.getModel());
        }
    }

    public void compareWithMonitor(Display m) {
        this.compareSize(m);
        this.compareSharpness(m);
    }
}
