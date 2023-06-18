package com.erdemserhat.software_project_management_system;

/**
 * The `QualityAssuranceStrategy` enum represents different strategies used in quality assurance.
 */
public enum QualityAssuranceStrategy {
    MANUAL_TESTING("Manual Testing Strategy"),
    AUTOMATED_TESTING("Automated Testing Strategy"),
    CODE_REVIEWS("Code Reviews Strategy"),
    USER_ACCEPTANCE_TESTING("User Acceptance Testing Strategy"),
    CONTINUOUS_INTEGRATION("Continuous Integration Strategy");

    private final String strategyName;

    QualityAssuranceStrategy(String strategyName) {
        this.strategyName = strategyName;
    }

    @Override
    public String toString() {
        return this.strategyName;
    }
}
