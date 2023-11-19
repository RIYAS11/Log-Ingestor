package com.dyte.model;

public class MetaData {

    private String parentResourceId;

    public MetaData(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public String getParentResourceId() {
        return parentResourceId;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "parentResourceId='" + parentResourceId + '\'' +
                '}';
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public MetaData() {
    }
}
