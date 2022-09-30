package com.example.lab04;

public class Bai3Country {
    private int icon;
    private String name;
    private boolean checked;

    public Bai3Country(int icon, String name) {
        this.icon = icon;
        this.name = name;
        this.checked = false;
    }

    public Bai3Country(int icon, String name, boolean checked) {
        this.icon = icon;
        this.name = name;
        this.checked = checked;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
