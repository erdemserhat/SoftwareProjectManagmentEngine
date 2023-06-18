package com.erdemserhat.software_project_management_system;

/**
 * Represents a performance test or scenario.
 */
public class PerformanceTest {
    private String testName;
    private int concurrentUsers;
    private long responseTime;
    private String description;

    /**
     * Creates a new performance test with the specified test name, number of concurrent users, response time, and description.
     *
     * @param testName        The name or title of the performance test.
     * @param concurrentUsers The number of simultaneous users or virtual users simulated during the test.
     * @param responseTime    The time taken for the system or application to respond during the test.
     * @param description     A brief description or summary of the performance test.
     */
    public PerformanceTest(String testName, int concurrentUsers, long responseTime, String description) {
        this.testName = testName;
        this.concurrentUsers = concurrentUsers;
        this.responseTime = responseTime;
        this.description = description;
    }

    /**
     * Retrieves the test name of the performance test.
     *
     * @return The test name.
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
     * Sets the test name of the performance test.
     *
     * @param testName The new test name.
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
     * Retrieves the number of concurrent users simulated during the performance test.
     *
     * @return The number of concurrent users.
     */
    public int getConcurrentUsers() {
        try {
            return concurrentUsers;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the number of concurrent users.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the number of concurrent users simulated during the performance test.
     *
     * @param concurrentUsers The new number of concurrent users.
     */
    public void setConcurrentUsers(int concurrentUsers) {
        try {
            this.concurrentUsers = concurrentUsers;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the number of concurrent users.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the response time of the system or application during the performance test.
     *
     * @return The response time.
     */
    public long getResponseTime() {
        try {
            return responseTime;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the response time.");
            e.printStackTrace();
            return 0L;
        }
    }

    /**
     * Sets the response time of the system or application during the performance test.
     *
     * @param responseTime The new response time.
     */
    public void setResponseTime(long responseTime) {
        try {
            this.responseTime = responseTime;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the response time.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the description of the performance test.
     *
     * @return The description.
     */
    public String getDescription() {
        try {
            return description;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the description.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the description of the performance test.
     *
     * @param description The new description.
     */
    public void setDescription(String description) {
        try {
            this.description = description;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the description.");
            e.printStackTrace();
        }
    }
}
