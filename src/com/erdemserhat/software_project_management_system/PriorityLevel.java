package com.erdemserhat.software_project_management_system;

/**
 * Represents the priority levels for a task or an item.
 */
public enum PriorityLevel {
    LOW("Low Priority"),
    MEDIUM("Medium Priority"),
    HIGH("High Priority"),
    CRITICAL("Critical Priority");

    private final String priorityName;

    /**
     * Creates a new priority level with the specified priority name.
     *
     * @param priorityName The name associated with the priority level.
     */
    PriorityLevel(String priorityName) {
        this.priorityName = priorityName;
    }

    /**
     * Returns the name associated with the priority level.
     *
     * @return The priority name.
     */
    @Override
    public String toString() {
        return priorityName;
    }
}
