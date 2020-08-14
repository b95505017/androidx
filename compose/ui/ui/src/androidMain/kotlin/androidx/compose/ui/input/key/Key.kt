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

package androidx.compose.ui.input.key

import android.view.KeyEvent

/**
 * Actual implementation of [Key] for Android.
 *
 * @param keyCode an integer code representing the key pressed.
 */
actual inline class Key(val keyCode: Int) {
    actual companion object {
        actual val Unknown = Key(KeyEvent.KEYCODE_UNKNOWN)
        actual val SoftLeft = Key(KeyEvent.KEYCODE_SOFT_LEFT)
        actual val SoftRight = Key(KeyEvent.KEYCODE_SOFT_RIGHT)
        actual val Home = Key(KeyEvent.KEYCODE_HOME)
        actual val Back = Key(KeyEvent.KEYCODE_BACK)
        actual val Help = Key(KeyEvent.KEYCODE_HELP)
        actual val NavigatePrevious = Key(KeyEvent.KEYCODE_NAVIGATE_PREVIOUS)
        actual val NavigateNext = Key(KeyEvent.KEYCODE_NAVIGATE_NEXT)
        actual val NavigateIn = Key(KeyEvent.KEYCODE_NAVIGATE_IN)
        actual val NavigateOut = Key(KeyEvent.KEYCODE_NAVIGATE_OUT)
        actual val SystemNavigationUp = Key(KeyEvent.KEYCODE_SYSTEM_NAVIGATION_UP)
        actual val SystemNavigationDown = Key(KeyEvent.KEYCODE_SYSTEM_NAVIGATION_DOWN)
        actual val SystemNavigationLeft = Key(KeyEvent.KEYCODE_SYSTEM_NAVIGATION_LEFT)
        actual val SystemNavigationRight = Key(KeyEvent.KEYCODE_SYSTEM_NAVIGATION_RIGHT)
        actual val Call = Key(KeyEvent.KEYCODE_CALL)
        actual val EndCall = Key(KeyEvent.KEYCODE_ENDCALL)
        actual val DPadUp = Key(KeyEvent.KEYCODE_DPAD_UP)
        actual val DPadDown = Key(KeyEvent.KEYCODE_DPAD_DOWN)
        actual val DPadLeft = Key(KeyEvent.KEYCODE_DPAD_LEFT)
        actual val DPadRight = Key(KeyEvent.KEYCODE_DPAD_RIGHT)
        actual val DPadCenter = Key(KeyEvent.KEYCODE_DPAD_CENTER)
        actual val DPadUpLeft = Key(KeyEvent.KEYCODE_DPAD_UP_LEFT)
        actual val DPadDownLeft = Key(KeyEvent.KEYCODE_DPAD_DOWN_LEFT)
        actual val DPadUpRight = Key(KeyEvent.KEYCODE_DPAD_UP_RIGHT)
        actual val DPadDownRight = Key(KeyEvent.KEYCODE_DPAD_DOWN_RIGHT)
        actual val VolumeUp = Key(KeyEvent.KEYCODE_VOLUME_UP)
        actual val VolumeDown = Key(KeyEvent.KEYCODE_VOLUME_DOWN)
        actual val Power = Key(KeyEvent.KEYCODE_POWER)
        actual val Camera = Key(KeyEvent.KEYCODE_CAMERA)
        actual val Clear = Key(KeyEvent.KEYCODE_CLEAR)
        actual val Number0 = Key(KeyEvent.KEYCODE_0)
        actual val Number1 = Key(KeyEvent.KEYCODE_1)
        actual val Number2 = Key(KeyEvent.KEYCODE_2)
        actual val Number3 = Key(KeyEvent.KEYCODE_3)
        actual val Number4 = Key(KeyEvent.KEYCODE_4)
        actual val Number5 = Key(KeyEvent.KEYCODE_5)
        actual val Number6 = Key(KeyEvent.KEYCODE_6)
        actual val Number7 = Key(KeyEvent.KEYCODE_7)
        actual val Number8 = Key(KeyEvent.KEYCODE_8)
        actual val Number9 = Key(KeyEvent.KEYCODE_9)
        actual val Number11 = Key(KeyEvent.KEYCODE_11)
        actual val Number12 = Key(KeyEvent.KEYCODE_12)
        actual val Plus = Key(KeyEvent.KEYCODE_PLUS)
        actual val Minus = Key(KeyEvent.KEYCODE_MINUS)
        actual val Multiply = Key(KeyEvent.KEYCODE_STAR)
        actual val Equals = Key(KeyEvent.KEYCODE_EQUALS)
        actual val Pound = Key(KeyEvent.KEYCODE_POUND)
        actual val A = Key(KeyEvent.KEYCODE_A)
        actual val B = Key(KeyEvent.KEYCODE_B)
        actual val C = Key(KeyEvent.KEYCODE_C)
        actual val D = Key(KeyEvent.KEYCODE_D)
        actual val E = Key(KeyEvent.KEYCODE_E)
        actual val F = Key(KeyEvent.KEYCODE_F)
        actual val G = Key(KeyEvent.KEYCODE_G)
        actual val H = Key(KeyEvent.KEYCODE_H)
        actual val I = Key(KeyEvent.KEYCODE_I)
        actual val J = Key(KeyEvent.KEYCODE_J)
        actual val K = Key(KeyEvent.KEYCODE_K)
        actual val L = Key(KeyEvent.KEYCODE_L)
        actual val M = Key(KeyEvent.KEYCODE_M)
        actual val N = Key(KeyEvent.KEYCODE_N)
        actual val O = Key(KeyEvent.KEYCODE_O)
        actual val P = Key(KeyEvent.KEYCODE_P)
        actual val Q = Key(KeyEvent.KEYCODE_Q)
        actual val R = Key(KeyEvent.KEYCODE_R)
        actual val S = Key(KeyEvent.KEYCODE_S)
        actual val T = Key(KeyEvent.KEYCODE_T)
        actual val U = Key(KeyEvent.KEYCODE_U)
        actual val V = Key(KeyEvent.KEYCODE_V)
        actual val W = Key(KeyEvent.KEYCODE_W)
        actual val X = Key(KeyEvent.KEYCODE_X)
        actual val Y = Key(KeyEvent.KEYCODE_Y)
        actual val Z = Key(KeyEvent.KEYCODE_Z)
        actual val Comma = Key(KeyEvent.KEYCODE_COMMA)
        actual val Period = Key(KeyEvent.KEYCODE_PERIOD)
        actual val AltLeft = Key(KeyEvent.KEYCODE_ALT_LEFT)
        actual val AltRight = Key(KeyEvent.KEYCODE_ALT_RIGHT)
        actual val ShiftLeft = Key(KeyEvent.KEYCODE_SHIFT_LEFT)
        actual val ShiftRight = Key(KeyEvent.KEYCODE_SHIFT_RIGHT)
        actual val Tab = Key(KeyEvent.KEYCODE_TAB)
        actual val Spacebar = Key(KeyEvent.KEYCODE_SPACE)
        actual val Symbol = Key(KeyEvent.KEYCODE_SYM)
        actual val Browser = Key(KeyEvent.KEYCODE_EXPLORER)
        actual val Envelope = Key(KeyEvent.KEYCODE_ENVELOPE)
        actual val Enter = Key(KeyEvent.KEYCODE_ENTER)
        actual val Backspace = Key(KeyEvent.KEYCODE_DEL)
        actual val Delete = Key(KeyEvent.KEYCODE_FORWARD_DEL)
        actual val Escape = Key(KeyEvent.KEYCODE_ESCAPE)
        actual val CtrlLeft = Key(KeyEvent.KEYCODE_CTRL_LEFT)
        actual val CtrlRight = Key(KeyEvent.KEYCODE_CTRL_RIGHT)
        actual val CapsLock = Key(KeyEvent.KEYCODE_CAPS_LOCK)
        actual val ScrollLock = Key(KeyEvent.KEYCODE_SCROLL_LOCK)
        actual val MetaLeft = Key(KeyEvent.KEYCODE_META_LEFT)
        actual val MetaRight = Key(KeyEvent.KEYCODE_META_RIGHT)
        actual val Function = Key(KeyEvent.KEYCODE_FUNCTION)
        actual val PrintScreen = Key(KeyEvent.KEYCODE_SYSRQ)
        actual val Break = Key(KeyEvent.KEYCODE_BREAK)
        actual val MoveHome = Key(KeyEvent.KEYCODE_MOVE_HOME)
        actual val MoveEnd = Key(KeyEvent.KEYCODE_MOVE_END)
        actual val Insert = Key(KeyEvent.KEYCODE_INSERT)
        actual val Cut = Key(KeyEvent.KEYCODE_CUT)
        actual val Copy = Key(KeyEvent.KEYCODE_COPY)
        actual val Paste = Key(KeyEvent.KEYCODE_PASTE)
        actual val Grave = Key(KeyEvent.KEYCODE_GRAVE)
        actual val LeftBracket = Key(KeyEvent.KEYCODE_LEFT_BRACKET)
        actual val RightBracket = Key(KeyEvent.KEYCODE_RIGHT_BRACKET)
        actual val Slash = Key(KeyEvent.KEYCODE_SLASH)
        actual val Backslash = Key(KeyEvent.KEYCODE_BACKSLASH)
        actual val Semicolon = Key(KeyEvent.KEYCODE_SEMICOLON)
        actual val Apostrophe = Key(KeyEvent.KEYCODE_APOSTROPHE)
        actual val At = Key(KeyEvent.KEYCODE_AT)
        actual val Number = Key(KeyEvent.KEYCODE_NUM)
        actual val HeadsetHook = Key(KeyEvent.KEYCODE_HEADSETHOOK)
        actual val Focus = Key(KeyEvent.KEYCODE_FOCUS)
        actual val Menu = Key(KeyEvent.KEYCODE_MENU)
        actual val Notification = Key(KeyEvent.KEYCODE_NOTIFICATION)
        actual val Search = Key(KeyEvent.KEYCODE_SEARCH)
        actual val PageUp = Key(KeyEvent.KEYCODE_PAGE_UP)
        actual val PageDown = Key(KeyEvent.KEYCODE_PAGE_DOWN)
        actual val PictureSymbols = Key(KeyEvent.KEYCODE_PICTSYMBOLS)
        actual val SwitchCharset = Key(KeyEvent.KEYCODE_SWITCH_CHARSET)
        actual val ButtonA = Key(KeyEvent.KEYCODE_BUTTON_A)
        actual val ButtonB = Key(KeyEvent.KEYCODE_BUTTON_B)
        actual val ButtonC = Key(KeyEvent.KEYCODE_BUTTON_C)
        actual val ButtonX = Key(KeyEvent.KEYCODE_BUTTON_X)
        actual val ButtonY = Key(KeyEvent.KEYCODE_BUTTON_Y)
        actual val ButtonZ = Key(KeyEvent.KEYCODE_BUTTON_Z)
        actual val ButtonL1 = Key(KeyEvent.KEYCODE_BUTTON_L1)
        actual val ButtonR1 = Key(KeyEvent.KEYCODE_BUTTON_R1)
        actual val ButtonL2 = Key(KeyEvent.KEYCODE_BUTTON_L2)
        actual val ButtonR2 = Key(KeyEvent.KEYCODE_BUTTON_R2)
        actual val ButtonThumbLeft = Key(KeyEvent.KEYCODE_BUTTON_THUMBL)
        actual val ButtonThumbRight = Key(KeyEvent.KEYCODE_BUTTON_THUMBR)
        actual val ButtonStart = Key(KeyEvent.KEYCODE_BUTTON_START)
        actual val ButtonSelect = Key(KeyEvent.KEYCODE_BUTTON_SELECT)
        actual val ButtonMode = Key(KeyEvent.KEYCODE_BUTTON_MODE)
        actual val Button1 = Key(KeyEvent.KEYCODE_BUTTON_1)
        actual val Button2 = Key(KeyEvent.KEYCODE_BUTTON_2)
        actual val Button3 = Key(KeyEvent.KEYCODE_BUTTON_3)
        actual val Button4 = Key(KeyEvent.KEYCODE_BUTTON_4)
        actual val Button5 = Key(KeyEvent.KEYCODE_BUTTON_5)
        actual val Button6 = Key(KeyEvent.KEYCODE_BUTTON_6)
        actual val Button7 = Key(KeyEvent.KEYCODE_BUTTON_7)
        actual val Button8 = Key(KeyEvent.KEYCODE_BUTTON_8)
        actual val Button9 = Key(KeyEvent.KEYCODE_BUTTON_9)
        actual val Button10 = Key(KeyEvent.KEYCODE_BUTTON_10)
        actual val Button11 = Key(KeyEvent.KEYCODE_BUTTON_11)
        actual val Button12 = Key(KeyEvent.KEYCODE_BUTTON_12)
        actual val Button13 = Key(KeyEvent.KEYCODE_BUTTON_13)
        actual val Button14 = Key(KeyEvent.KEYCODE_BUTTON_14)
        actual val Button15 = Key(KeyEvent.KEYCODE_BUTTON_15)
        actual val Button16 = Key(KeyEvent.KEYCODE_BUTTON_16)
        actual val Forward = Key(KeyEvent.KEYCODE_FORWARD)
        actual val F1 = Key(KeyEvent.KEYCODE_F1)
        actual val F2 = Key(KeyEvent.KEYCODE_F2)
        actual val F3 = Key(KeyEvent.KEYCODE_F3)
        actual val F4 = Key(KeyEvent.KEYCODE_F4)
        actual val F5 = Key(KeyEvent.KEYCODE_F5)
        actual val F6 = Key(KeyEvent.KEYCODE_F6)
        actual val F7 = Key(KeyEvent.KEYCODE_F7)
        actual val F8 = Key(KeyEvent.KEYCODE_F8)
        actual val F9 = Key(KeyEvent.KEYCODE_F9)
        actual val F10 = Key(KeyEvent.KEYCODE_F10)
        actual val F11 = Key(KeyEvent.KEYCODE_F11)
        actual val F12 = Key(KeyEvent.KEYCODE_F12)
        actual val NumLock = Key(KeyEvent.KEYCODE_NUM_LOCK)
        actual val NumPad0 = Key(KeyEvent.KEYCODE_NUMPAD_0)
        actual val NumPad1 = Key(KeyEvent.KEYCODE_NUMPAD_1)
        actual val NumPad2 = Key(KeyEvent.KEYCODE_NUMPAD_2)
        actual val NumPad3 = Key(KeyEvent.KEYCODE_NUMPAD_3)
        actual val NumPad4 = Key(KeyEvent.KEYCODE_NUMPAD_4)
        actual val NumPad5 = Key(KeyEvent.KEYCODE_NUMPAD_5)
        actual val NumPad6 = Key(KeyEvent.KEYCODE_NUMPAD_6)
        actual val NumPad7 = Key(KeyEvent.KEYCODE_NUMPAD_7)
        actual val NumPad8 = Key(KeyEvent.KEYCODE_NUMPAD_8)
        actual val NumPad9 = Key(KeyEvent.KEYCODE_NUMPAD_9)
        actual val NumPadDivide = Key(KeyEvent.KEYCODE_NUMPAD_DIVIDE)
        actual val NumPadMultiply = Key(KeyEvent.KEYCODE_NUMPAD_MULTIPLY)
        actual val NumPadSubtract = Key(KeyEvent.KEYCODE_NUMPAD_SUBTRACT)
        actual val NumPadAdd = Key(KeyEvent.KEYCODE_NUMPAD_ADD)
        actual val NumPadDot = Key(KeyEvent.KEYCODE_NUMPAD_DOT)
        actual val NumPadComma = Key(KeyEvent.KEYCODE_NUMPAD_COMMA)
        actual val NumPadEnter = Key(KeyEvent.KEYCODE_NUMPAD_ENTER)
        actual val NumPadEquals = Key(KeyEvent.KEYCODE_NUMPAD_EQUALS)
        actual val NumPadLeftParenthesis = Key(KeyEvent.KEYCODE_NUMPAD_LEFT_PAREN)
        actual val NumPadRightParenthesis = Key(KeyEvent.KEYCODE_NUMPAD_RIGHT_PAREN)
        actual val MediaPlay = Key(KeyEvent.KEYCODE_MEDIA_PLAY)
        actual val MediaPause = Key(KeyEvent.KEYCODE_MEDIA_PAUSE)
        actual val MediaPlayPause = Key(KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE)
        actual val MediaStop = Key(KeyEvent.KEYCODE_MEDIA_STOP)
        actual val MediaRecord = Key(KeyEvent.KEYCODE_MEDIA_RECORD)
        actual val MediaNext = Key(KeyEvent.KEYCODE_MEDIA_NEXT)
        actual val MediaPrevious = Key(KeyEvent.KEYCODE_MEDIA_PREVIOUS)
        actual val MediaRewind = Key(KeyEvent.KEYCODE_MEDIA_REWIND)
        actual val MediaFastForward = Key(KeyEvent.KEYCODE_MEDIA_FAST_FORWARD)
        actual val MediaClose = Key(KeyEvent.KEYCODE_MEDIA_CLOSE)
        actual val MediaAudioTrack = Key(KeyEvent.KEYCODE_MEDIA_AUDIO_TRACK)
        actual val MediaEject = Key(KeyEvent.KEYCODE_MEDIA_EJECT)
        actual val MediaTopMenu = Key(KeyEvent.KEYCODE_MEDIA_TOP_MENU)
        actual val MediaSkipForward = Key(KeyEvent.KEYCODE_MEDIA_SKIP_FORWARD)
        actual val MediaSkipBackward = Key(KeyEvent.KEYCODE_MEDIA_SKIP_BACKWARD)
        actual val MediaStepForward = Key(KeyEvent.KEYCODE_MEDIA_STEP_FORWARD)
        actual val MediaStepBackward = Key(KeyEvent.KEYCODE_MEDIA_STEP_BACKWARD)
        actual val MicrophoneMute = Key(KeyEvent.KEYCODE_MUTE)
        actual val VolumeMute = Key(KeyEvent.KEYCODE_VOLUME_MUTE)
        actual val Info = Key(KeyEvent.KEYCODE_INFO)
        actual val ChannelUp = Key(KeyEvent.KEYCODE_CHANNEL_UP)
        actual val ChannelDown = Key(KeyEvent.KEYCODE_CHANNEL_DOWN)
        actual val ZoomIn = Key(KeyEvent.KEYCODE_ZOOM_IN)
        actual val ZoomOut = Key(KeyEvent.KEYCODE_ZOOM_OUT)
        actual val Tv = Key(KeyEvent.KEYCODE_TV)
        actual val Window = Key(KeyEvent.KEYCODE_WINDOW)
        actual val Guide = Key(KeyEvent.KEYCODE_GUIDE)
        actual val Dvr = Key(KeyEvent.KEYCODE_DVR)
        actual val Bookmark = Key(KeyEvent.KEYCODE_BOOKMARK)
        actual val Captions = Key(KeyEvent.KEYCODE_CAPTIONS)
        actual val Settings = Key(KeyEvent.KEYCODE_SETTINGS)
        actual val TvPower = Key(KeyEvent.KEYCODE_TV_POWER)
        actual val TvInput = Key(KeyEvent.KEYCODE_TV_INPUT)
        actual val SetTopBoxPower = Key(KeyEvent.KEYCODE_STB_POWER)
        actual val SetTopBoxInput = Key(KeyEvent.KEYCODE_STB_INPUT)
        actual val AvReceiverPower = Key(KeyEvent.KEYCODE_AVR_POWER)
        actual val AvReceiverInput = Key(KeyEvent.KEYCODE_AVR_INPUT)
        actual val ProgramRed = Key(KeyEvent.KEYCODE_PROG_RED)
        actual val ProgramGreen = Key(KeyEvent.KEYCODE_PROG_GREEN)
        actual val ProgramYellow = Key(KeyEvent.KEYCODE_PROG_YELLOW)
        actual val ProgramBlue = Key(KeyEvent.KEYCODE_PROG_BLUE)
        actual val AppSwitch = Key(KeyEvent.KEYCODE_APP_SWITCH)
        actual val LanguageSwitch = Key(KeyEvent.KEYCODE_LANGUAGE_SWITCH)
        actual val MannerMode = Key(KeyEvent.KEYCODE_MANNER_MODE)
        actual val Toggle2D3D = Key(KeyEvent.KEYCODE_3D_MODE)
        actual val Contacts = Key(KeyEvent.KEYCODE_CONTACTS)
        actual val Calendar = Key(KeyEvent.KEYCODE_CALENDAR)
        actual val Music = Key(KeyEvent.KEYCODE_MUSIC)
        actual val Calculator = Key(KeyEvent.KEYCODE_CALCULATOR)
        actual val ZenkakuHankaru = Key(KeyEvent.KEYCODE_ZENKAKU_HANKAKU)
        actual val Eisu = Key(KeyEvent.KEYCODE_EISU)
        actual val Muhenkan = Key(KeyEvent.KEYCODE_MUHENKAN)
        actual val Henkan = Key(KeyEvent.KEYCODE_HENKAN)
        actual val KatakanaHiragana = Key(KeyEvent.KEYCODE_KATAKANA_HIRAGANA)
        actual val Yen = Key(KeyEvent.KEYCODE_YEN)
        actual val Ro = Key(KeyEvent.KEYCODE_RO)
        actual val Kana = Key(KeyEvent.KEYCODE_KANA)
        actual val Assist = Key(KeyEvent.KEYCODE_ASSIST)
        actual val BrightnessDown = Key(KeyEvent.KEYCODE_BRIGHTNESS_DOWN)
        actual val BrightnessUp = Key(KeyEvent.KEYCODE_BRIGHTNESS_UP)
        actual val Sleep = Key(KeyEvent.KEYCODE_SLEEP)
        actual val WakeUp = Key(KeyEvent.KEYCODE_WAKEUP)
        actual val SoftSleep = Key(KeyEvent.KEYCODE_SOFT_SLEEP)
        actual val Pairing = Key(KeyEvent.KEYCODE_PAIRING)
        actual val LastChannel = Key(KeyEvent.KEYCODE_LAST_CHANNEL)
        actual val TvDataService = Key(KeyEvent.KEYCODE_TV_DATA_SERVICE)
        actual val VoiceAssist = Key(KeyEvent.KEYCODE_VOICE_ASSIST)
        actual val TvRadioService = Key(KeyEvent.KEYCODE_TV_RADIO_SERVICE)
        actual val TvTeletext = Key(KeyEvent.KEYCODE_TV_TELETEXT)
        actual val TvNumberEntry = Key(KeyEvent.KEYCODE_TV_NUMBER_ENTRY)
        actual val TvTerrestrialAnalog = Key(KeyEvent.KEYCODE_TV_TERRESTRIAL_ANALOG)
        actual val TvTerrestrialDigital = Key(KeyEvent.KEYCODE_TV_TERRESTRIAL_DIGITAL)
        actual val TvSatellite = Key(KeyEvent.KEYCODE_TV_SATELLITE)
        actual val TvSatelliteBs = Key(KeyEvent.KEYCODE_TV_SATELLITE_BS)
        actual val TvSatelliteCs = Key(KeyEvent.KEYCODE_TV_SATELLITE_CS)
        actual val TvSatelliteService = Key(KeyEvent.KEYCODE_TV_SATELLITE_SERVICE)
        actual val TvNetwork = Key(KeyEvent.KEYCODE_TV_NETWORK)
        actual val TvAntennaCable = Key(KeyEvent.KEYCODE_TV_ANTENNA_CABLE)
        actual val TvInputHdmi1 = Key(KeyEvent.KEYCODE_TV_INPUT_HDMI_1)
        actual val TvInputHdmi2 = Key(KeyEvent.KEYCODE_TV_INPUT_HDMI_2)
        actual val TvInputHdmi3 = Key(KeyEvent.KEYCODE_TV_INPUT_HDMI_3)
        actual val TvInputHdmi4 = Key(KeyEvent.KEYCODE_TV_INPUT_HDMI_4)
        actual val TvInputComposite1 = Key(KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_1)
        actual val TvInputComposite2 = Key(KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_2)
        actual val TvInputComponent1 = Key(KeyEvent.KEYCODE_TV_INPUT_COMPONENT_1)
        actual val TvInputComponent2 = Key(KeyEvent.KEYCODE_TV_INPUT_COMPONENT_2)
        actual val TvInputVga1 = Key(KeyEvent.KEYCODE_TV_INPUT_VGA_1)
        actual val TvAudioDescription = Key(KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION)
        actual val TvAudioDescriptionMixingVolumeUp =
            Key(KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP)
        actual val TvAudioDescriptionMixingVolumeDown =
            Key(KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN)
        actual val TvZoomMode = Key(KeyEvent.KEYCODE_TV_ZOOM_MODE)
        actual val TvContentsMenu = Key(KeyEvent.KEYCODE_TV_CONTENTS_MENU)
        actual val TvMediaContextMenu = Key(KeyEvent.KEYCODE_TV_MEDIA_CONTEXT_MENU)
        actual val TvTimerProgramming = Key(KeyEvent.KEYCODE_TV_TIMER_PROGRAMMING)
        actual val StemPrimary = Key(KeyEvent.KEYCODE_STEM_PRIMARY)
        actual val Stem1 = Key(KeyEvent.KEYCODE_STEM_1)
        actual val Stem2 = Key(KeyEvent.KEYCODE_STEM_2)
        actual val Stem3 = Key(KeyEvent.KEYCODE_STEM_3)
        actual val AllApps = Key(KeyEvent.KEYCODE_ALL_APPS)
        actual val Refresh = Key(KeyEvent.KEYCODE_REFRESH)
        actual val ThumbsUp = Key(KeyEvent.KEYCODE_THUMBS_UP)
        actual val ThumbsDown = Key(KeyEvent.KEYCODE_THUMBS_DOWN)
        actual val ProfileSwitch = Key(KeyEvent.KEYCODE_PROFILE_SWITCH)
    }

    actual override fun toString(): String {
        return "Key code: $keyCode"
    }
}