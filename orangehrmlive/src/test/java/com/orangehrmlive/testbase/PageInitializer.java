package com.orangehrmlive.testbase;


import com.orangehrmlive.pages.LeaveRequestPage;
import com.orangehrmlive.pages.LoginPage;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static LeaveRequestPage leaveRequestPage;
    public static void initialize() {
        // initialize pages
         loginPage = new LoginPage();
        leaveRequestPage = new LeaveRequestPage();

    }
}
