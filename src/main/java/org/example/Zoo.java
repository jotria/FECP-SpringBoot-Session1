package org.example;

import java.util.HashMap;

public class Zoo {

    private boolean isZooOpen;
    private HashMap<String, String> zooSetupList;


    public Zoo() {
        zooSetupList = new HashMap<>();
        this.isZooOpen = false;
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }

    public void setZooOpen(boolean zooOpen) {
        isZooOpen = zooOpen;
    }

    public HashMap<String, String> getZooSetupList() {
        return zooSetupList;
    }

    public void setZooSetupList(HashMap<String, String> zooSetupList) {
        this.zooSetupList = zooSetupList;
    }
}
