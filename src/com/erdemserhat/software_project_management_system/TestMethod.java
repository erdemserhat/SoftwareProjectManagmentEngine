package com.erdemserhat.software_project_management_system;

/**
 * The `TestMethod` enum represents different test methods or tools used in testing.
 * It defines four possible methods: TEST_AUTOMATION, BUG_TRACKING, PERFORMANCE, and LOAD.
 */
public enum TestMethod {
    /**
     * Represents the test automation method.
     */
    TEST_AUTOMATION("Test Automation"),

    /**
     * Represents the bug tracking method.
     */
    BUG_TRACKING("Bug Tracking"),

    /**
     * Represents the performance testing method.
     */
    PERFORMANCE("Performance"),

    /**
     * Represents the load testing method.
     */
    LOAD("Load");

    private final String toolName;

    /**
     * Constructs a `TestMethod` enum constant with the specified tool name.
     *
     * @param toolName The name of the testing tool or method.
     */
    TestMethod(String toolName) {
        this.toolName = toolName;
    }

    /**
     * Returns the name of the testing tool or method.
     *
     * @return The name of the tool or method.
     */
    public String getToolName() {
        return toolName;
    }
}
