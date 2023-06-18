package com.erdemserhat.software_project_management_system;

/**
 * The CompatibilityTest class represents a tool or framework used to assess the compatibility between different components, systems, or entities within a software environment. This class provides methods and attributes to perform compatibility testing and evaluate the compatibility level based on predefined criteria.
 */
public class CompatibilityTest {
    private String platform;
    private String browser;
    private String operatingSystem;
    private String description;

    /**
     * Constructs a CompatibilityTest object with the specified platform, browser, operating system, and description.
     *
     * @param platform        The platform or environment on which the software or application will be running, such as web, mobile, desktop, or a specific platform/framework.
     * @param browser         The specific web browser(s) that the software or application should be compatible with, such as Chrome, Firefox, Safari, or Internet Explorer.
     * @param operatingSystem The operating system(s) that the software or application should be compatible with, such as Windows, macOS, Linux, iOS, or Android.
     * @param description     A brief description or summary of the software or application, outlining its purpose, functionality, and any specific requirements or features.
     */
    public CompatibilityTest(String platform, String browser, String operatingSystem, String description) {
        this.platform = platform;
        this.browser = browser;
        this.operatingSystem = operatingSystem;
        this.description = description;
    }

    /**
     * Retrieves the platform of the compatibility test.
     *
     * @return The platform of the compatibility test.
     */
    public String getPlatform() {
        try {
            return platform;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the platform.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the platform of the compatibility test.
     *
     * @param platform The platform to set.
     */
    public void setPlatform(String platform) {
        try {
            this.platform = platform;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the platform.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the browser of the compatibility test.
     *
     * @return The browser of the compatibility test.
     */
    public String getBrowser() {
        try {
            return browser;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the browser.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the browser of the compatibility test.
     *
     * @param browser The browser to set.
     */
    public void setBrowser(String browser) {
        try {
            this.browser = browser;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the browser.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the operating system of the compatibility test.
     *
     * @return The operating system of the compatibility test.
     */
    public String getOperatingSystem() {
        try {
            return operatingSystem;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the operating system.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the operating system of the compatibility test.
     *
     * @param operatingSystem The operating system to set.
     */
    public void setOperatingSystem(String operatingSystem) {
        try {
            this.operatingSystem = operatingSystem;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the operating system.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the description of the compatibility test.
     *
     * @return The description of the compatibility test.
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
     * Sets the description of the compatibility test.
     *
     * @param description The description to set.
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
