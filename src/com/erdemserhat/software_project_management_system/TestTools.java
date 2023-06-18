package com.erdemserhat.software_project_management_system;

/**
 * The `TestTools` enum represents various testing tools that can be used in software testing.
 */
public enum TestTools {
    SELENIUM("Selenium"),
    APPIUM("Appium"),
    JUNIT("JUnit"),
    TESTNG("TestNG"),
    POSTMAN("Postman"),
    JMETER("JMeter");

    private final String toolName;

    /**
     * Constructs a `TestTools` enum constant with the specified tool name.
     *
     * @param toolName The name of the testing tool.
     */
    TestTools(String toolName) {
        this.toolName = toolName;
    }

    /**
     * Returns the name of the testing tool.
     *
     * @return The name of the testing tool.
     */
    public String getToolName() {
        return toolName;
    }
}
