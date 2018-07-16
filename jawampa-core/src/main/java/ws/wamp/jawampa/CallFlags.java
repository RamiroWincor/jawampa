/*
 * Copyright 2014 Matthias Einwag
 *
 * The jawampa authors license this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package ws.wamp.jawampa;

public enum CallFlags {
    /**
     * Set the disclose_me flag on the Call message to true.<br>
     * This will allow the remote call endpoint to access information on this client's WAMP session.
     */
    DiscloseMe,
    
    MatchExact, //default, exact procedure URI match and not necessary to specify but will override if multiple match flags are present
    MatchPrefix, // match for all precedure calls that have the given uri prefix
    MatchWildcard,
    
    ReceiveProgress // Should progress messages be sent if the call is long running
}
