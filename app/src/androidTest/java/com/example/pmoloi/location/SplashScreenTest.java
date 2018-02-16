package com.example.pmoloi.location;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.pmoloi.location.presentation.splash.SplashScreenActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class SplashScreenTest {

    @Rule
    public ActivityTestRule<SplashScreenActivity> mActivityTestRule = new ActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void appNameDisplay() {
        Espresso.onView(withId(R.id.textViewSplashScreenAppName)).check(matches(withText("Location")));
    }

    @Test
    public void appVersionCodeDisplay() {
        Espresso.onView(withId(R.id.textViewSplashScreenVersionCodeLabel)).check(matches(withText(BuildConfig.VERSION_NAME)));
    }
}
