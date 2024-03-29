package com.astro.smitesolver.discord.entity.auxillary;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity(name="god_names")
public class GodName {

    @Id
    private Integer godID;

    private String godName;

    public GodName(Integer godID, String godName) {
        this.godID = godID;
        this.godName = godName;
    }

    public GodName() { }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public String getGodName() {
        return godName;
    }

    public void setGodName(String godName) {
        this.godName = godName;
    }
}
