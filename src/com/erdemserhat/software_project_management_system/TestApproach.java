package com.erdemserhat.software_project_management_system;

/**
 * Represents different test approaches for software testing.
 */
public enum TestApproach {
    RE_RUN("Re-run all previously executed test cases"),
    SELECT_PRIORITIZE("Select and prioritize test cases based on risk analysis"),
    EXPLORATORY("Exploratory testing"),
    AUTOMATION("Automated testing"),
    AD_HOC("Ad-hoc testing");

    private final String description;

    /**
     * Constructs a TestApproach enum value with the given description.
     *
     * @param description The description of the test approach.
     */
    TestApproach(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the test approach.
     *
     * @return The description of the test approach.
     */
    public String getDescription() {
        return description;
    }
}
