package com.example.ravikant.mvp;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ravikant on 20/7/17.
 **/

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {
    ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkUserNameEditTextIsDisplayed(){
        activityActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.txtName)).check(matches(isDisplayed()));
    }

    @Test
    public void checkPasswordEditTextIsDisplayed(){
        activityActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.txtPass)).check(matches(isDisplayed()));
    }

    @Test
    public void checkLoginSuccess() {
        activityActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.txtName)).perform(typeText("ravi"),closeSoftKeyboard());
        onView(withId(R.id.txtPass)).perform(typeText("ravi"),closeSoftKeyboard());
        onView(withId(R.id.btnLogin)).check(matches(isDisplayed())).perform(click());
        onView(withText("Login Success")).check(matches(isDisplayed()));
    }
}
