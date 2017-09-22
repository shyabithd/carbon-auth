/*
 *
 *   Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.auth.scim.impl;

/**
 * Model class to hold claim mappings
 *
 */
public class ClaimInfo {

    private String claimUri;
    
    private boolean unique;
    
    public ClaimInfo(String claimUri, boolean unique) {
        this.claimUri = claimUri;
        this.unique = unique;
    }
    public String getClaimUri() {
        return claimUri;
    }
    public void setClaimUri(String claimUri) {
        this.claimUri = claimUri;
    }
    public boolean isUnique() {
        return unique;
    }
    public void setUnique(boolean unique) {
        this.unique = unique;
    }
    
}