package com.erdemserhat.software_project_management_system;

/**
 * The GUITest class represents a test case or test scenario for GUI (Graphical User Interface) testing.
 * It stores information such as the test name, test description, test steps, and expected results.
 */
public class GUITest {
    // Attributes
    private String testName;
    private String testDescription;
    private String testSteps;
    private String expectedResults;

    /**
     * Constructs a new GUITest object with the specified information.
     *
     * @param testName        The name or title of the test case or test scenario.
     * @param testDescription A description or summary of the test case, outlining its purpose, objective, or specific requirements.
     * @param testSteps       The sequence of steps or actions to be performed as part of the test case.
     * @param expectedResults The expected outcome or results that should be observed when the test case is executed successfully.
     */
    public GUITest(String testName, String testDescription, String testSteps, String expectedResults) {
        this.testName = testName;
        this.testDescription = testDescription;
        this.testSteps = testSteps;
        this.expectedResults = expectedResults;
    }

    /**
     * Retrieves the name or title of the test case or test scenario.
     *
     * @return The name or title of the test case or test scenario.
     */
    public String getTestName() {
        try {
            return testName;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the test name.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the name or title of the test case or test scenario.
     *
     * @param testName The name or title of the test case or test scenario.
     */
    public void setTestName(String testName) {
        try {
            this.testName = testName;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the test name.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the description or summary of the test case.
     *
     * @return The description or summary of the test case.
     */
    public String getTestDescription() {
        try {
            return testDescription;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the test description.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the description or summary of the test case.
     *
     * @param testDescription The description or summary of the test case.
     */
    public void setTestDescription(String testDescription) {
        try {
            this.testDescription = testDescription;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the test description.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the sequence of steps or actions to be performed as part of the test case.
     *
     * @return The sequence of steps or actions to be performed.
     */
    public String getTestSteps() {
        try {
            return testSteps;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the test steps.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the sequence of steps or actions to be performed as part of the test case.
     *
     * @param testSteps The sequence of steps or actions to be performed.
     */
    public void setTestSteps(String testSteps) {
        try {
            this.testSteps = testSteps;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the test steps.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the expected outcome or results that should be observed when the test case is executed successfully.
     *
     * @return The expected outcome or results.
     */
    public String getExpectedResults() {
        try {
            return expectedResults;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the expected results.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the expected outcome or results that should be observed when the test case is executed successfully.
     *
     * @param expectedResults The expected outcome or results.
     */
    public void setExpectedResults(String expectedResults) {
        try {
            this.expectedResults = expectedResults;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the expected results.");
            e.printStackTrace();
        }
    }
}
