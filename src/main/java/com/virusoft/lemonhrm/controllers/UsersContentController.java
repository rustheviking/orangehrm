package com.virusoft.lemonhrm.controllers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

public class UsersContentController {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
