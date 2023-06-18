package com.erdemserhat.software_project_management_system;

import java.util.List;

/**
 * The `TestScenario` class represents a test scenario that defines the steps,
 * expected results, acceptance criteria, and other details for testing a system or application.
 */
public class TestScenario {
    private String scenarioName;
    private String scenarioDescription;
    private String initialState;
    private List<String> steps;
    private List<String> expectedResults;
    private List<String> acceptanceCriteria;
    private List<Note> notes;

    /**
     * Constructs a `TestScenario` object with the specified parameters.
     *
     * @param scenarioName        The name of the test scenario.
     * @param scenarioDescription The description of the test scenario.
     * @param initialState        The initial state of the system or application being tested.
     * @param steps               The steps to be followed during the test scenario execution.
     * @param expectedResults     The expected results or outcomes of the test scenario.
     * @param acceptanceCriteria  The criteria that must be met for the test scenario to be considered successful.
     * @param notes               Additional notes or comments related to the test scenario.
     */
    public TestScenario(String scenarioName, String scenarioDescription, String initialState,
                        List<String> steps, List<String> expectedResults, List<String> acceptanceCriteria,
                        List<Note> notes) {
        this.scenarioName = scenarioName;
        this.scenarioDescription = scenarioDescription;
        this.initialState = initialState;
        this.steps = steps;
        this.expectedResults = expectedResults;
        this.acceptanceCriteria = acceptanceCriteria;
        this.notes = notes;
    }

    /**
     * Returns the name of the test scenario.
     *
     * @return The name of the test scenario.
     */
    public String getScenarioName() {
        return scenarioName;
    }

    /**
     * Sets the name of the test scenario.
     *
     * @param scenarioName The name of the test scenario.
     */
    public void setScenarioName(String scenarioName) {
        try {
            this.scenarioName = scenarioName;
        } catch (Exception e) {
            System.err.println("Error setting scenario name: " + e.getMessage());
        }
    }

    /**
     * Returns the description of the test scenario.
     *
     * @return The description of the test scenario.
     */
    public String getScenarioDescription() {
        return scenarioDescription;
    }

    /**
     * Sets the description of the test scenario.
     *
     * @param scenarioDescription The description of the test scenario.
     */
    public void setScenarioDescription(String scenarioDescription) {
        try {
            this.scenarioDescription = scenarioDescription;
        } catch (Exception e) {
            System.err.println("Error setting scenario description: " + e.getMessage());
        }
    }

    /**
     * Returns the initial state of the system or application being tested.
     *
     * @return The initial state of the system or application being tested.
     */
    public String getInitialState() {
        return initialState;
    }

    /**
     * Sets the initial state of the system or application being tested.
     *
     * @param initialState The initial state of the system or application being tested.
     */
    public void setInitialState(String initialState) {
        try {
            this.initialState = initialState;
        } catch (Exception e) {
            System.err.println("Error setting initial state: " + e.getMessage());
        }
    }

    /**
     * Returns the steps to be followed during the test scenario execution.
     *
     * @return The steps to be followed during the test scenario execution.
     */
    public List<String> getSteps() {
        return steps;
    }

    /**
     * Sets the steps to be followed during the test scenario execution.
     *
     * @param steps The steps to be followed during the test scenario execution.
     */
    public void setSteps(List<String> steps) {
        try {
            this.steps = steps;
        } catch (Exception e) {
            System.err.println("Error setting steps: " + e.getMessage());
        }
    }

    /**
     * Returns the expected results or outcomes of the test scenario.
     *
     * @return The expected results or outcomes of the test scenario.
     */
    public List<String> getExpectedResults() {
        return expectedResults;
    }

    /**
     * Sets the expected results or outcomes of the test scenario.
     *
     * @param expectedResults The expected results or outcomes of the test scenario.
     */
    public void setExpectedResults(List<String> expectedResults) {
        try {
            this.expectedResults = expectedResults;
        } catch (Exception e) {
            System.err.println("Error setting expected results: " + e.getMessage());
        }
    }

    /**
     * Returns the acceptance criteria that must be met for the test scenario to be considered successful.
     *
     * @return The acceptance criteria for the test scenario.
     */
    public List<String> getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    /**
     * Sets the acceptance criteria that must be met for the test scenario to be considered successful.
     *
     * @param acceptanceCriteria The acceptance criteria for the test scenario.
     */
    public void setAcceptanceCriteria(List<String> acceptanceCriteria) {
        try {
            this.acceptanceCriteria = acceptanceCriteria;
        } catch (Exception e) {
            System.err.println("Error setting acceptance criteria: " + e.getMessage());
        }
    }

    /**
     * Returns the additional notes or comments related to the test scenario.
     *
     * @return The additional notes or comments related to the test scenario.
     */
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Sets the additional notes or comments related to the test scenario.
     *
     * @param notes The additional notes or comments related to the test scenario.
     */
    public void setNotes(List<Note> notes) {
        try {
            this.notes = notes;
        } catch (Exception e) {
            System.err.println("Error setting notes: " + e.getMessage());
        }
    }
}
