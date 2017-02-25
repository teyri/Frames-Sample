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

package jahirfiquitiva.walls.frames;

import android.os.Bundle;

import jahirfiquitiva.libs.frames.activities.base.LaunchActivity;

public class MainActivity extends LaunchActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getKey() {
        return "your_key_goes_here";
    }

    @Override
    protected boolean allAma() {
        return false;
    }

    @Override
    protected boolean check() {
        // TODO: Replace with true or false
        return !BuildConfig.DEBUG;
    }
}