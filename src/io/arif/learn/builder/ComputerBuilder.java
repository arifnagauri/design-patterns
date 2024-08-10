package io.arif.learn.builder;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step and get rid of Constructor Telescoping.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 * There are many flavours of this simple pattern...
 */
public class ComputerBuilder {

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


    public void setMotherBoardCompany(String motherBoardCompany) {
        this.motherBoardCompany = motherBoardCompany;
    }

    public void setCpuCompany(String cpuCompany) {
        this.cpuCompany = cpuCompany;
    }

    public void setCpuVersion(Float cpuVersion) {
        this.cpuVersion = cpuVersion;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public void setMonitorCompany(String monitorCompany) {
        this.monitorCompany = monitorCompany;
    }

    public void setMonitorSize(Float monitorSize) {
        this.monitorSize = monitorSize;
    }

    public void setCasingCompany(String casingCompany) {
        this.casingCompany = casingCompany;
    }

    public void setGraphicCardCompany(String graphicCardCompany) {
        this.graphicCardCompany = graphicCardCompany;
    }

    public void setGraphicCardSize(Float graphicCardSize) {
        this.graphicCardSize = graphicCardSize;
    }

    // getters...
    public String getMotherBoardCompany() {
        return motherBoardCompany;
    }

    public String getCpuCompany() {
        return cpuCompany;
    }

    public Float getCpuVersion() {
        return cpuVersion;
    }

    public String getRam() {
        return ram;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public String getMonitorCompany() {
        return monitorCompany;
    }

    public Float getMonitorSize() {
        return monitorSize;
    }

    public String getCasingCompany() {
        return casingCompany;
    }

    public String getGraphicCardCompany() {
        return graphicCardCompany;
    }

    public Float getGraphicCardSize() {
        return graphicCardSize;
    }
}
