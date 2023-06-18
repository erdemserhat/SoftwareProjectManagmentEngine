package com.erdemserhat.software_project_management_system;
/**
 * The CollaborationAbility class represents a set of functionalities and attributes that enable collaboration in a software system. This class provides methods and properties that facilitate cooperation among different components, modules, or entities within the system.
 */
public enum CollaborationAbility {
    LOW("Low", "Low work efficiency, weak team collaboration"),
    MEDIUM("Medium", "Average work efficiency, acceptable collaboration"),
    HIGH("High", "High work efficiency, strong team collaboration");

    private final String abilityLevel;
    private final String description;

    CollaborationAbility(String abilityLevel, String description) {
        this.abilityLevel = abilityLevel;
        this.description = description;
    }

    /**
     * Retrieves the ability level.
     *
     * @return The ability level as a string.
     */
    public String getAbilityLevel() {
        try {
            return abilityLevel;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the ability level.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Retrieves the description of the collaboration ability.
     *
     * @return The description of the collaboration ability.
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

    @Override
    public String toString() {
        return abilityLevel + "\n" + description;
    }
}
