package com.erdemserhat.software_project_management_system;

/**
 * Represents different types of process improvement methodologies or practices.
 */
public enum ProcessImprovement {
    LEAN_SIX_SIGMA("Lean Six Sigma methodology"),
    AGILE("Agile practices"),
    PROCESS_AUTOMATION("Process automation tools"),
    KAIZEN("Kaizen principles");

    private final String processImprovementType;

    /**
     * Creates a new ProcessImprovement enum constant with the specified process improvement type.
     *
     * @param processImprovementType The type of process improvement methodology or practice.
     */
    ProcessImprovement(String processImprovementType) {
        this.processImprovementType = processImprovementType;
    }

    /**
     * Returns a string representation of the process improvement type.
     *
     * @return The process improvement type as a string.
     */
    @Override
    public String toString() {
        return this.processImprovementType;
    }
}
