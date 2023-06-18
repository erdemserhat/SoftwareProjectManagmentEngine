package com.erdemserhat.software_project_management_system;

/**
 * Represents a process documentation item.
 */
public class ProcessDocumentation {
    private String title;
    private String description;
    private String recommendation;

    /**
     * Creates a new process documentation item with the specified title, description, and recommendation.
     *
     * @param title          The title or name of the item or recommendation.
     * @param description    A description or summary of the item or recommendation.
     * @param recommendation The specific recommendation or suggestion being made related to the item or document.
     */
    public ProcessDocumentation(String title, String description, String recommendation) {
        this.title = title;
        this.description = description;
        this.recommendation = recommendation;
    }

    /**
     * Returns the title of the process documentation item.
     *
     * @return The title of the item.
     */
    public String getTitle() {
        try {
            return title;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the title.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the title of the process documentation item.
     *
     * @param title The title of the item.
     */
    public void setTitle(String title) {
        try {
            this.title = title;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the title.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the description of the process documentation item.
     *
     * @return The description of the item.
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
     * Sets the description of the process documentation item.
     *
     * @param description The description of the item.
     */
    public void setDescription(String description) {
        try {
            this.description = description;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the description.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the recommendation of the process documentation item.
     *
     * @return The recommendation of the item.
     */
    public String getRecommendation() {
        try {
            return recommendation;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the recommendation.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the recommendation of the process documentation item.
     *
     * @param recommendation The recommendation of the item.
     */
    public void setRecommendation(String recommendation) {
        try {
            this.recommendation = recommendation;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the recommendation.");
            e.printStackTrace();
        }
    }
}
