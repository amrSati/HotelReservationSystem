package edu.cds.reservationsystem;

public enum RoomType {
    SINGLE("Single"), DOUBLE("Double");

    private String displayName;

    private RoomType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
