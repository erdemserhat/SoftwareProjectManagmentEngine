package com.erdemserhat.software_project_management_system;

/**
 * Represents a note with a title and description.
 */
public class Note {
    private String title;
    private String description;

    /**
     * Creates a new note with the specified title and description.
     *
     * @param title       The title or name of the note.
     * @param description A description or summary of the note.
     */
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * Retrieves the title of the note.
     *
     * @return The title of the note.
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
     * Sets the title of the note.
     *
     * @param title The new title of the note.
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
     * Retrieves the description of the note.
     *
     * @return The description of the note.
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
     * Sets the description of the note.
     *
     * @param description The new description of the note.
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

