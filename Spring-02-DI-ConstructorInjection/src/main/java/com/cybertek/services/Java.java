package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    public int x;
    ExtraSessions extraSessions;
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public Java(OfficeHours officeHours) {
        this.extraSessions = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
    }
}
