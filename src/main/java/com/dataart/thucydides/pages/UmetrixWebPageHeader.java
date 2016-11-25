package com.dataart.thucydides.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

/**
 * Created by achernyshev on 24.11.2016.
 */
public class UmetrixWebPageHeader extends PageObject {

    @FindBy(id = "dashboard")
    public WebElementFacade spirentDashboard;
    @FindBy(id = "projects")
    public WebElementFacade spirentProjects;
    @FindBy(id = "reports")
    public List<WebElementFacade> reportsDropDownMenu;
    @FindBy(id = "admin")
    public List<WebElementFacade> adminDropDownMenu;
    @FindBy(id = "profile")
    public WebElementFacade currentProfile;
    @FindBy(id = "logout")
    public WebElementFacade logoutButton;

    public void spirentDashboardClick() {
        spirentDashboard.click();
    }

    // opens new web page with all available projects
    public void navigateToProjects() {
        spirentProjects.click();
    }

    public void clickReportsMenuItem (int i) {
        reportsDropDownMenu.get(i - 1).click();
    }

    public void adminMenuItem (int i) {
        adminDropDownMenu.get(i - 1).click();
    }

    public String getCurrentProfile() {
        return currentProfile.getText();
    }

    // opens new web page with profile details
    public void navigateToProfileDetails() {
        currentProfile.click();
    }

//    public void assertHeader(User user) {
//        assertEquals(getCurrentProfile(),
//                String.format(user.getUsername()));
//    }
}
