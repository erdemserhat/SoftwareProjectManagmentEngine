package com.erdemserhat.software_project_management_system;

/**
 * The `TestingProcessStatus` enum represents the status of the testing process.
 * It defines three possible states: PLANNING, IN_PROGRESS, and COMPLETED.
 */
public enum TestingProcessStatus {
    /**
     * Indicates that the testing process is in the planning phase.
     */
    PLANNING("Testing process status is the phase of planning"),

    /**
     * Indicates that testing is currently in progress.
     */
    IN_PROGRESS("Testing is in progress"),

    /**
     * Indicates that testing has been completed.
     */
    COMPLETED("Testing is completed");

    private final String status;

    /**
     * Constructs a `TestingProcessStatus` enum constant with the specified status.
     *
     * @param status The status of the testing process.
     */
    TestingProcessStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the testing process status.
     *
     * @return The string representation of the status.
     */
    @Override
    public String toString() {
        return this.status;
    }
}
