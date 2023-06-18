package com.erdemserhat.software_project_management_system;

/**
 * Represents different options for test environments in software testing.
 */
public enum TestEnvironmentOption {
    TEST_SERVER("Test Server"),
    TEST_DATABASE("Test Database"),
    SANDBOX("on Sandbox");

    private final String environmentName;

    /**
     * Constructs a TestEnvironmentOption enum value with the given environment name.
     *
     * @param environmentName The name of the test environment option.
     */
    TestEnvironmentOption(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * Returns the name of the test environment option.
     *
     * @return The name of the test environment option.
     */
    @Override
    public String toString() {
        return environmentName;
    }
}
