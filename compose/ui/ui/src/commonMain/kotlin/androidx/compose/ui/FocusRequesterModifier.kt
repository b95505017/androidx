/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.ui

import androidx.compose.ui.focus.FocusReference

/**
 * A [modifier][Modifier.Element] that can be used to pass in a [FocusReference] that can be used
 * to request focus state changes.
 *
 * @see FocusReference
 */
@Deprecated(
    message = "Use FocusReferenceModifier instead",
    replaceWith = ReplaceWith(
        "FocusReferenceModifier",
        "androidx.compose.ui.focus.FocusReferenceModifier"
    ),
    level = DeprecationLevel.ERROR
)
interface FocusRequesterModifier : Modifier.Element {
    /**
     * An instance of [FocusReference], that can be used to request focus state changes.
     */
    val focusReference: FocusReference
}

/**
 * Add this modifier to a component to observe changes to focus state.
 */
@Suppress("UNUSED_PARAMETER")
@Deprecated(
    message = "Use Modifier.focusReference instead",
    replaceWith = ReplaceWith(
        "this.focusReference(focusReference)",
        "androidx.compose.ui.focus.focusReference"
    ),
    level = DeprecationLevel.ERROR
)
fun Modifier.focusRequester(focusRequester: Any): Modifier = this
