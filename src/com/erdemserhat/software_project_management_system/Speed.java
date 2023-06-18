package com.erdemserhat.software_project_management_system;

/**
 * The `Speed` enum represents different speed levels.
 */
public enum Speed {
    SLOWEST("Slowest"),
    SLOW("Slow"),
    MEDIUM("Medium"),
    FAST("Fast"),
    FASTEST("Fastest");

    private final String speedName;

    Speed(String speedName) {
        this.speedName = speedName;
    }

    @Override
    public String toString() {
        return this.speedName;
    }
}
