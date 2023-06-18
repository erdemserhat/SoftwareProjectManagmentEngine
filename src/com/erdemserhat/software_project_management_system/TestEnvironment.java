package com.erdemserhat.software_project_management_system;

/**
 * Represents different test environments for software testing.
 */
public enum TestEnvironment {
    DEVELOPMENT("Development Environment"),
    LIVE("Live Environment"),
    SIMULATED("Simulated Environment");

    private final String environmentName;

    /**
     * Constructs a TestEnvironment enum value with the given environment name.
     *
     * @param environmentName The name of the test environment.
     */
    TestEnvironment(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * Returns the name of the test environment.
     *
     * @return The name of the test environment.
     */
    @Override
    public String toString() {
        return this.environmentName;
    }
}
