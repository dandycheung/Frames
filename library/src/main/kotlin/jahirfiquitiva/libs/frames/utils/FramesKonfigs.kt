/*
 * Copyright (c) 2017. Jahir Fiquitiva
 *
 * Licensed under the CreativeCommons Attribution-ShareAlike
 * 4.0 International License. You may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *    http://creativecommons.org/licenses/by-sa/4.0/legalcode
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jahirfiquitiva.libs.frames.utils

import android.content.Context
import jahirfiquitiva.libs.kauextensions.utils.Konfigurations

class FramesKonfigs(cntxt:Context):Konfigurations(cntxt) {
    companion object {
        fun newInstance(context:Context) = Konfigurations(context)
    }

    var backupJson:String
        get() = prefs.getString(BACKUP_JSON, "[]")
        set(value) = prefsEditor.putString(BACKUP_JSON, value).apply()
}