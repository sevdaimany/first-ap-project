package test;

public class PC {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private Case theCase;

    public PC(Monitor monitor, MotherBoard motherBoard, Case theCase) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }
}
