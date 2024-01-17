package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)
val pages = listOf(
    Page(
        title = "KHABAR-Explore Diverse News",
        description = "Discover a world of diverse news experiences with our News App KHABAR. Stay informed on the latest stories from around the globe.",
        image = R.drawable.onboardingv1
    ),
    Page(
        title = "Latest Updates at Your Fingertips",
        description = "Get the latest news updates at your fingertips, providing you with a seamless and engaging reading experience.",
        image = R.drawable.onboardingv2
    ),
    Page(
        title = "Personalized News Feed",
        description = "Tailor your news experience with a personalized news feed. Get updates on topics that matter most to you and explore a variety of perspectives.",
        image = R.drawable.onboardingv3
    )
)
