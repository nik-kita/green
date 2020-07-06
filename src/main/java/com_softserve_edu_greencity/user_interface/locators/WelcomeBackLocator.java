package com_softserve_edu_greencity.user_interface.locators;


import org.openqa.selenium.By;

public enum WelcomeBackLocator implements Locator {
    UPRIGHT_LITTLE_CLOSE_BUTTON(By.cssSelector("img[alt='close button']")),
    BIG_LEFT_PICTURE(By.cssSelector("img.main-picture")),
    TITLE_WELCOME_BACK(By.cssSelector("div.right-side h1")),
    UNDER_TITLE_STING(By.cssSelector("div.right-side h2")),
    LITTLE_ON_EMAIL_LABEL(By.cssSelector("label[for='email']")),
    LITTLE_ON_PASSWORD_LABEL(By.cssSelector("label[for='password']")),
    EMAIL_INPUT(By.cssSelector("#email")),
    PASSWORD_INPUT(By.cssSelector("#password")),
    LITTLE_PASSWORD_EYE(By.cssSelector("img.image-show-hide-password")),
    FORGOT_PASSWORD_QUESTION_TITLE(By.cssSelector("a.forgot-password")),
    SIGN_IN_SUBMIT_BUTTON(By.cssSelector("button.primary-global-button[type='submit']")),
    OR_LITTLE_LABEL_BETWEEN_SUBMIT_BUTTONS(By.cssSelector(".or-use-google")),
    GOOGLE_SIGN_IN_SUBMIT_BUTTON(By.cssSelector(".google-text-sign-in")),
    DID_YOU_HAVE_ACCOUNT_LITTLE_SIGN_UP(By.cssSelector(".missing-account a"));






    private By path;

    WelcomeBackLocator(By path) {
        this.path = path;
    }

    public By path() {
        return path;
    }


}
