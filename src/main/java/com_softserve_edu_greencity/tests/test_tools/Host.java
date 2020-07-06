package com_softserve_edu_greencity.tests.test_tools;

public enum Host {
    INTER("https://ita-social-projects.github.io/GreenCityClient/#/welcome"),
    LOCAL("http://localhost:4200/#/welcome");

    public String getUrl() {
        return url;
    }



    private String url;
    Host(String url) {
        this.url = url;
    }
}
