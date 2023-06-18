package com.erdemserhat.software_project_management_system;

/**
 * The `SocialMediaAccount` class represents a social media account associated with an individual or entity.
 */
public class SocialMediaAccount {
    private String username;
    private String platform;
    private String url;
    private int followers;
    private boolean verified;

    /**
     * Creates a new `SocialMediaAccount` object with the specified details.
     *
     * @param username  The username or handle associated with the social media account.
     * @param platform  The platform or social media network where the account is located (e.g., Twitter, Instagram).
     * @param url       The URL or link to the social media account.
     * @param followers The number of followers or subscribers to the social media account.
     * @param verified  A flag indicating whether the social media account is verified or authenticated.
     */
    public SocialMediaAccount(String username, String platform, String url, int followers, boolean verified) {
        this.username = username;
        this.platform = platform;
        this.url = url;
        this.followers = followers;
        this.verified = verified;
    }

    /**
     * Retrieves the username associated with the social media account.
     *
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username associated with the social media account.
     *
     * @param username The username to be set.
     */
    public void setUsername(String username) {
        try {
            this.username = username;
        } catch (Exception e) {
            System.err.println("Error setting username: " + e.getMessage());
        }
    }

    /**
     * Retrieves the platform or social media network where the account is located.
     *
     * @return The platform.
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the platform or social media network where the account is located.
     *
     * @param platform The platform to be set.
     */
    public void setPlatform(String platform) {
        try {
            this.platform = platform;
        } catch (Exception e) {
            System.err.println("Error setting platform: " + e.getMessage());
        }
    }

    /**
     * Retrieves the URL or link to the social media account.
     *
     * @return The URL.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URL or link to the social media account.
     *
     * @param url The URL to be set.
     */
    public void setUrl(String url) {
        try {
            this.url = url;
        } catch (Exception e) {
            System.err.println("Error setting URL: " + e.getMessage());
        }
    }

    /**
     * Retrieves the number of followers or subscribers to the social media account.
     *
     * @return The number of followers.
     */
    public int getFollowers() {
        return followers;
    }

    /**
     * Sets the number of followers or subscribers to the social media account.
     *
     * @param followers The number of followers to be set.
     */
    public void setFollowers(int followers) {
        try {
            this.followers = followers;
        } catch (Exception e) {
            System.err.println("Error setting followers: " + e.getMessage());
        }
    }

    /**
     * Checks if the social media account is verified or authenticated.
     *
     * @return True if the account is verified, false otherwise.
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Sets the verification status of the social media account.
     *
     * @param verified The verification status to be set.
     */
    public void setVerified(boolean verified) {
        try {
            this.verified = verified;
        } catch (Exception e) {
            System.err.println("Error setting verification status: " + e.getMessage());
        }
    }
}
