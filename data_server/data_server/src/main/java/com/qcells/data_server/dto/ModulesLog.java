package com.qcells.data_server.dto;



public class ModulesLog {
    private int md_sn;
    private int st_id;
    private int gt_id;
    private long startTs;
    private long endTs;
    private float moduleVoltage;
    private float moduleTemperature;
    private int moduleWatt;
    private float moduleCurrent;


    public ModulesLog() {
    }

    public ModulesLog(int md_sn, int st_id, int gt_id, long startTs, long endTs, float moduleVoltage, float moduleTemperature, int moduleWatt, float moduleCurrent) {
        this.md_sn = md_sn;
        this.st_id = st_id;
        this.gt_id = gt_id;
        this.startTs = startTs;
        this.endTs = endTs;
        this.moduleVoltage = moduleVoltage;
        this.moduleTemperature = moduleTemperature;
        this.moduleWatt = moduleWatt;
        this.moduleCurrent = moduleCurrent;
    }

    public int getMd_sn() {
        return this.md_sn;
    }

    public void setMd_sn(int md_sn) {
        this.md_sn = md_sn;
    }

    public int getSt_id() {
        return this.st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public int getGt_id() {
        return this.gt_id;
    }

    public void setGt_id(int gt_id) {
        this.gt_id = gt_id;
    }

    public long getStartTs() {
        return this.startTs;
    }

    public void setStartTs(long startTs) {
        this.startTs = startTs;
    }

    public long getEndTs() {
        return this.endTs;
    }

    public void setEndTs(long endTs) {
        this.endTs = endTs;
    }

    public float getModuleVoltage() {
        return this.moduleVoltage;
    }

    public void setModuleVoltage(float moduleVoltage) {
        this.moduleVoltage = moduleVoltage;
    }

    public float getModuleTemperature() {
        return this.moduleTemperature;
    }

    public void setModuleTemperature(float moduleTemperature) {
        this.moduleTemperature = moduleTemperature;
    }

    public int getModuleWatt() {
        return this.moduleWatt;
    }

    public void setModuleWatt(int moduleWatt) {
        this.moduleWatt = moduleWatt;
    }

    public float getModuleCurrent() {
        return this.moduleCurrent;
    }

    public void setModuleCurrent(float moduleCurrent) {
        this.moduleCurrent = moduleCurrent;
    }

    public ModulesLog md_sn(int md_sn) {
        this.md_sn = md_sn;
        return this;
    }

    public ModulesLog st_id(int st_id) {
        this.st_id = st_id;
        return this;
    }

    public ModulesLog gt_id(int gt_id) {
        this.gt_id = gt_id;
        return this;
    }

    public ModulesLog startTs(long startTs) {
        this.startTs = startTs;
        return this;
    }

    public ModulesLog endTs(long endTs) {
        this.endTs = endTs;
        return this;
    }

    public ModulesLog moduleVoltage(float moduleVoltage) {
        this.moduleVoltage = moduleVoltage;
        return this;
    }

    public ModulesLog moduleTemperature(float moduleTemperature) {
        this.moduleTemperature = moduleTemperature;
        return this;
    }

    public ModulesLog moduleWatt(int moduleWatt) {
        this.moduleWatt = moduleWatt;
        return this;
    }

    public ModulesLog moduleCurrent(float moduleCurrent) {
        this.moduleCurrent = moduleCurrent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ModulesLog)) {
            return false;
        }
        ModulesLog modulesLog = (ModulesLog) o;
        return md_sn == modulesLog.md_sn && st_id == modulesLog.st_id && gt_id == modulesLog.gt_id && startTs == modulesLog.startTs && endTs == modulesLog.endTs && moduleVoltage == modulesLog.moduleVoltage && moduleTemperature == modulesLog.moduleTemperature && moduleWatt == modulesLog.moduleWatt && moduleCurrent == modulesLog.moduleCurrent;
    }

    @Override
    public String toString() {
        return "{" +
            " md_sn='" + getMd_sn() + "'" +
            ", st_id='" + getSt_id() + "'" +
            ", gt_id='" + getGt_id() + "'" +
            ", startTs='" + getStartTs() + "'" +
            ", endTs='" + getEndTs() + "'" +
            ", moduleVoltage='" + getModuleVoltage() + "'" +
            ", moduleTemperature='" + getModuleTemperature() + "'" +
            ", moduleWatt='" + getModuleWatt() + "'" +
            ", moduleCurrent='" + getModuleCurrent() + "'" +
            "}";
    }
    
}
