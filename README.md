# AnimatedCounter

AnimatedCounter is a simple Android project that demonstrates how to use the AnimatedContent API in Compose to create an animated counter. The counter displays a random number between 10,000 and 90,000, and each digit in the number is animated separately.


![animated_counter_record](https://github.com/swatii-solanki/AnimatedCounter/assets/43872077/12a31367-414a-42a5-9011-305acf0b8c03)


Technique Used
--------------

The AnimatedCounter function uses a Row composable to display each digit in the number. The digit is represented as a Char, and a UUID is used to ensure that the targetState of the AnimatedContent composable is unique.

The AnimatedContent composable is used to animate the change in the digit. The transitionSpec property is used to define the animation, which slides the new digit in from the top or bottom of the screen, depending on whether the index of the digit is even or odd.

The slideInVertically and slideOutVertically functions are used to define the animation, and the tween function is used to specify the duration and easing of the animation.


Code Overview
-------------

The MainActivity class sets the content of the activity using the setContent function. The AnimatedCounterTheme is used to style the app.

The Column composable is used to center the AnimatedCounter and Generate number button on the screen.

The number function generates a random number between 10,000 and 90,000, and the count variable is used to store the current number.

The AnimatedCounter composable is used to display the count variable, and the Generate number button is used to generate a new number.

The AnimatedCounter function is defined in the AnimatedCounter.kt file.

Links to Animation APIs used in this project
-----

* [AnimatedContent API](https://developer.android.com/reference/kotlin/androidx/compose/animation/AnimatedContent)
* [slideInVertically](https://developer.android.com/reference/kotlin/androidx/compose/animation/slideInVertically)
* [slideOutVertically](https://developer.android.com/reference/kotlin/androidx/compose/animation/slideOutVertically)
* [tween](https://developer.android.com/reference/kotlin/androidx/compose/animation/core/tween)

Conclusion
----------

AnimatedCounter is a simple project that demonstrates how to use the AnimatedContent API in Compose to create an animated counter. The project uses a Row composable to display each digit in the number, and the AnimatedContent composable is used to animate the change in the digit. The slideInVertically and slideOutVertically functions are used to define the animation, and the tween function is used to specify the duration and easing of the animation. The LocalTextStyle.current.copy function is used to set the font feature settings to "tnum", which is used to display the digits as tabular numbers.
