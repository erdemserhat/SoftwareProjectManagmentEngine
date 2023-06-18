package com.erdemserhat.software_project_management_system;

import java.util.List;

/**
 * The `TestStrategy` class represents a testing strategy that defines the approaches or methods used in testing.
 */
public class TestStrategy {
    private String strategyName;
    private String description;
    private List<TestApproach> testApproaches;

    /**
     * Constructs a `TestStrategy` object with the specified parameters.
     *
     * @param strategyName    The name of the testing strategy.
     * @param description     The description of the testing strategy.
     * @param testApproaches  The approaches or methods used in the testing strategy.
     */
    public TestStrategy(String strategyName, String description, List<TestApproach> testApproaches) {
        this.strategyName = strategyName;
        this.description = description;
        this.testApproaches = testApproaches;
    }

    /**
     * Returns the name of the testing strategy.
     *
     * @return The name of the testing strategy.
     */
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Sets the name of the testing strategy.
     *
     * @param strategyName The name of the testing strategy.
     */
    public void setStrategyName(String strategyName) {
        try {
            this.strategyName = strategyName;
        } catch (Exception e) {
            System.err.println("Error setting strategy name: " + e.getMessage());
        }
    }

    /**
     * Returns the description of the testing strategy.
     *
     * @return The description of the testing strategy.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the testing strategy.
     *
     * @param description The description of the testing strategy.
     */
    public void setDescription(String description) {
        try {
            this.description = description;
        } catch (Exception e) {
            System.err.println("Error setting description: " + e.getMessage());
        }
    }

    /**
     * Returns the approaches or methods used in the testing strategy.
     *
     * @return The approaches or methods used in the testing strategy.
     */
    public List<TestApproach> getTestApproaches() {
        return testApproaches;
    }

    /**
     * Sets the approaches or methods used in the testing strategy.
     *
     * @param testApproaches The approaches or methods used in the testing strategy.
     */
    public void setTestApproaches(List<TestApproach> testApproaches) {
        try {
            this.testApproaches = testApproaches;
        } catch (Exception e) {
            System.err.println("Error setting test approaches: " + e.getMessage());
        }
    }
}
