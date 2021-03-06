/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.guvnor.structure.server.config;

public enum ConfigType {

    GLOBAL( ".global" ),
    REPOSITORY( ".repository" ),
    ORGANIZATIONAL_UNIT( ".organizationalunit" ),
    PROJECT( ".project" ),
    EDITOR( ".editor" ),
    DEPLOYMENT( ".deployment" );

    private String ext;

    public String getExt() {
        return this.ext;
    }

    private ConfigType( String ext ) {
        this.ext = ext;
    }
}
