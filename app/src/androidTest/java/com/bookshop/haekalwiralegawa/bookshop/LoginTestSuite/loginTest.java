package com.bookshop.haekalwiralegawa.bookshop.LoginTestSuite;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.bookshop.haekalwiralegawa.bookshop.LoginActivity;
import com.bookshop.haekalwiralegawa.bookshop.R;
import com.bookshop.haekalwiralegawa.bookshop.custom.utilities.CommonTestingUtils;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by haekalwiralegawa on 12/27/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class loginTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule =
            new ActivityTestRule(LoginActivity.class);

    // Component
    ViewInteraction EMAIL = onView(withId(R.id.email));
    ViewInteraction PASSWORD = onView(withId(R.id.password));
    ViewInteraction buttonSignIn = onView(withId(R.id.email_sign_in_button));

    @Test
    public void assertLoginComponent(){

        EMAIL.check(matches(isDisplayed()));
        PASSWORD.check(matches(isDisplayed()));
        buttonSignIn.check(matches(isDisplayed()));

    }

    @Test
    public void typeSomeText(){
        CommonTestingUtils.delay(2000);
        EMAIL.perform(typeText("qekall@gmail.com"));
        CommonTestingUtils.delay(2000);
        PASSWORD.perform(typeText("password"));
        CommonTestingUtils.delay(3000);
    }
}
