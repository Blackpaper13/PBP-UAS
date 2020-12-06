package com.calvindo.aldi.sutanto.tubes;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashScreenActivityTestRegister {

    @Rule
    public ActivityTestRule<SplashScreenActivity> mActivityTestRule = new ActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void splashScreenActivityTestRegister() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText.perform(replaceText("christialla"));



        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.input_email), withText("christialla"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.input_email), withText("christialla"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("christialla.321@gmail.com"));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.input_email), withText("christialla.321@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(closeSoftKeyboard());



        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.input_username),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_username),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("mtk123456"));



        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.input_nama),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_nama),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("saya"));



        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.input_alamat),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_alamat),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText7.perform(replaceText("saya1"));



        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.input_notelp),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_notelp),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText8.perform(replaceText("087654321"));



        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.input_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("mtk123456"));



        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.input_username), withText("mtk123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_username),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText10.perform(replaceText("mtk"));

        ViewInteraction textInputEditText11 = onView(
                allOf(withId(R.id.input_username), withText("mtk"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_username),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText11.perform();



        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.register_button), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        6),
                                0),
                        isDisplayed()));
        materialButton6.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
