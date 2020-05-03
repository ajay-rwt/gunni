package ajayvikka.projects.gunni.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

    private long primaryMobileNumber;
    private long secondaryMobileNumber;
    private String primaryEmailId;
    private String secondaryEmailId;
    private String website;

    public Contact() { }

    public Contact(
            long primaryMobileNumber,
            long secondaryMobileNumber,
            String primaryEmailId,
            String secondaryEmailId,
            String website
    ) {
        this.primaryMobileNumber = primaryMobileNumber;
        this.secondaryMobileNumber = secondaryMobileNumber;
        this.primaryEmailId = primaryEmailId;
        this.secondaryEmailId = secondaryEmailId;
        this.website = website;
    }

    public long getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public void setPrimaryMobileNumber(long primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
    }

    public long getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    public void setSecondaryMobileNumber(long secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
    }

    public String getPrimaryEmailId() {
        return primaryEmailId;
    }

    public void setPrimaryEmailId(String primaryEmailId) {
        this.primaryEmailId = primaryEmailId;
    }

    public String getSecondaryEmailId() {
        return secondaryEmailId;
    }

    public void setSecondaryEmailId(String secondaryEmailId) {
        this.secondaryEmailId = secondaryEmailId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
