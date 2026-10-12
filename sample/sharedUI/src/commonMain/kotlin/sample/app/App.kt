package sample.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.loading.*

@Composable
fun App() {
    val color = Color(0xFF007F7C)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize()
                .wrapContentWidth(Alignment.CenterHorizontally),
            columns = GridCells.Adaptive(minSize = 100.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 48.dp),
        ) {
            item {
                SpinnerItem("Arc") {
                    Arc(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Atom") {
                    Atom(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Blocks") {
                    Blocks(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("BouncingDots") {
                    BouncingDots(
                        modifier = Modifier.size(
                            24.dp
                        ), color = color
                    )
                }
            }
            item {
                SpinnerItem("Cascade") {
                    Cascade(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("CircularDots") {
                    CircularDots(
                        modifier = Modifier.size(
                            24.dp
                        ), color = color
                    )
                }
            }
            item {
                SpinnerItem("Classic") {
                    Classic(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("ClassicV2") {
                    ClassicV2(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Clock") {
                    Clock(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Comet") {
                    Comet(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Compass") {
                    Compass(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Dual") {
                    Dual(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Eclipse") {
                    Eclipse(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Flip") {
                    Flip(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Gather") {
                    Gather(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Leap") {
                    Leap(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("LinearDots") {
                    LinearDots(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Loading") {
                    Loading(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Morph") {
                    Morph(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Orbit") {
                    Orbit(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Pulse") {
                    Pulse(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Radar") {
                    Radar(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Ring") {
                    Ring(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Ripple") {
                    Ripple(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Slide") {
                    Slide(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Snake") {
                    Snake(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Swirl") {
                    Swirl(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Trace") {
                    Trace(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
            item {
                SpinnerItem("Wave") {
                    Wave(
                        modifier = Modifier.size(24.dp),
                        color = color
                    )
                }
            }
        }
//    Box(
//        modifier = Modifier.fillMaxSize().background(Color.Yellow),
//        contentAlignment = Alignment.Center
//    ) {
//        Cascade(modifier = Modifier.size(24.dp), color = Color(0xFF007F7C))
//        //BasicText("getFibonacciNumbers(7)=${getFibonacciNumbers(7).joinToString(", ")}")
//    }
    }
}


@Composable
private fun SpinnerItem(name: String, content: @Composable () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        content()
        BasicText(text = name, style = TextStyle(color = Color.Black))
    }
}
