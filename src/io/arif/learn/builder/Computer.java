package io.arif.learn.builder;

public class Computer {
    private String motherBoardCompany;
    private String cpuCompany;
    private Float cpuVersion;
    private String ram;
    private Integer ramSize;
    private String monitorCompany;
    private Float monitorSize;
    private String casingCompany;
    private String graphicCardCompany;
    private Float graphicCardSize;
    // and many more fields;

    public Computer(ComputerBuilder builder) {
        this.motherBoardCompany = builder.getMotherBoardCompany();
        this.cpuCompany = builder.getCpuCompany();
        this.cpuVersion = builder.getCpuVersion();
        this.ram = builder.getRam();
        this.ramSize = builder.getRamSize();
        this.monitorCompany = builder.getMonitorCompany();
        this.monitorSize = builder.getMonitorSize();
        this.casingCompany = builder.getCasingCompany();
        this.graphicCardCompany = builder.getGraphicCardCompany();
        this.graphicCardSize = builder.getGraphicCardSize();
    }
}
