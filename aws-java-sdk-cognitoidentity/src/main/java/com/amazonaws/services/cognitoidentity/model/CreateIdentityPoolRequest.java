/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest) CreateIdentityPool operation}.
 * <p>
 * Creates a new identity pool. The identity pool is a store of user
 * identity information that is specific to your AWS account. The limit
 * on identity pools is 60 per account.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest)
 */
public class CreateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     */
    private String identityPoolName;

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     */
    private Boolean allowUnauthenticatedIdentities;

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private java.util.Map<String,String> supportedLoginProviders;

    /**
     * The "domain" by which Cognito will refer to your users. This name acts
     * as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as
     * period (<code>.</code>), underscore (<code>_</code>), and dash
     * (<code>-</code>). <p>Once you have set a developer provider name, you
     * cannot change it. Please take care in setting this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     */
    private String developerProviderName;

    /**
     * A list of OpendID Connect provider ARNs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNs;

    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @return A string that you provide.
     */
    public String getIdentityPoolName() {
        return identityPoolName;
    }
    
    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName A string that you provide.
     */
    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }
    
    /**
     * A string that you provide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName A string that you provide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @return TRUE if the identity pool supports unauthenticated logins.
     */
    public Boolean isAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }
    
    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @param allowUnauthenticatedIdentities TRUE if the identity pool supports unauthenticated logins.
     */
    public void setAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }
    
    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUnauthenticatedIdentities TRUE if the identity pool supports unauthenticated logins.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @return TRUE if the identity pool supports unauthenticated logins.
     */
    public Boolean getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return Optional key:value pairs mapping provider names to provider app IDs.
     */
    public java.util.Map<String,String> getSupportedLoginProviders() {
        
        return supportedLoginProviders;
    }
    
    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param supportedLoginProviders Optional key:value pairs mapping provider names to provider app IDs.
     */
    public void setSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }
    
    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param supportedLoginProviders Optional key:value pairs mapping provider names to provider app IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        setSupportedLoginProviders(supportedLoginProviders);
        return this;
    }

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * The method adds a new key-value pair into SupportedLoginProviders
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param key The key of the entry to be added into SupportedLoginProviders.
     * @param value The corresponding value of the entry to be added into SupportedLoginProviders.
     */
    public CreateIdentityPoolRequest addSupportedLoginProvidersEntry(String key, String value) {
        if (null == this.supportedLoginProviders) {
            this.supportedLoginProviders = new java.util.HashMap<String,String>();
        }
        if (this.supportedLoginProviders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.supportedLoginProviders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupportedLoginProviders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public CreateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
        return this;
    }
    
    /**
     * The "domain" by which Cognito will refer to your users. This name acts
     * as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as
     * period (<code>.</code>), underscore (<code>_</code>), and dash
     * (<code>-</code>). <p>Once you have set a developer provider name, you
     * cannot change it. Please take care in setting this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return The "domain" by which Cognito will refer to your users. This name acts
     *         as a placeholder that allows your backend and the Cognito service to
     *         communicate about the developer provider. For the
     *         <code>DeveloperProviderName</code>, you can use letters as well as
     *         period (<code>.</code>), underscore (<code>_</code>), and dash
     *         (<code>-</code>). <p>Once you have set a developer provider name, you
     *         cannot change it. Please take care in setting this parameter.
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }
    
    /**
     * The "domain" by which Cognito will refer to your users. This name acts
     * as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as
     * period (<code>.</code>), underscore (<code>_</code>), and dash
     * (<code>-</code>). <p>Once you have set a developer provider name, you
     * cannot change it. Please take care in setting this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName The "domain" by which Cognito will refer to your users. This name acts
     *         as a placeholder that allows your backend and the Cognito service to
     *         communicate about the developer provider. For the
     *         <code>DeveloperProviderName</code>, you can use letters as well as
     *         period (<code>.</code>), underscore (<code>_</code>), and dash
     *         (<code>-</code>). <p>Once you have set a developer provider name, you
     *         cannot change it. Please take care in setting this parameter.
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }
    
    /**
     * The "domain" by which Cognito will refer to your users. This name acts
     * as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as
     * period (<code>.</code>), underscore (<code>_</code>), and dash
     * (<code>-</code>). <p>Once you have set a developer provider name, you
     * cannot change it. Please take care in setting this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName The "domain" by which Cognito will refer to your users. This name acts
     *         as a placeholder that allows your backend and the Cognito service to
     *         communicate about the developer provider. For the
     *         <code>DeveloperProviderName</code>, you can use letters as well as
     *         period (<code>.</code>), underscore (<code>_</code>), and dash
     *         (<code>-</code>). <p>Once you have set a developer provider name, you
     *         cannot change it. Please take care in setting this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * A list of OpendID Connect provider ARNs.
     *
     * @return A list of OpendID Connect provider ARNs.
     */
    public java.util.List<String> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }
    
    /**
     * A list of OpendID Connect provider ARNs.
     *
     * @param openIdConnectProviderARNs A list of OpendID Connect provider ARNs.
     */
    public void setOpenIdConnectProviderARNs(java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(openIdConnectProviderARNs.size());
        openIdConnectProviderARNsCopy.addAll(openIdConnectProviderARNs);
        this.openIdConnectProviderARNs = openIdConnectProviderARNsCopy;
    }
    
    /**
     * A list of OpendID Connect provider ARNs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIdConnectProviderARNs A list of OpendID Connect provider ARNs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(String... openIdConnectProviderARNs) {
        if (getOpenIdConnectProviderARNs() == null) setOpenIdConnectProviderARNs(new java.util.ArrayList<String>(openIdConnectProviderARNs.length));
        for (String value : openIdConnectProviderARNs) {
            getOpenIdConnectProviderARNs().add(value);
        }
        return this;
    }
    
    /**
     * A list of OpendID Connect provider ARNs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIdConnectProviderARNs A list of OpendID Connect provider ARNs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(openIdConnectProviderARNs.size());
            openIdConnectProviderARNsCopy.addAll(openIdConnectProviderARNs);
            this.openIdConnectProviderARNs = openIdConnectProviderARNsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolName() != null) sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (isAllowUnauthenticatedIdentities() != null) sb.append("AllowUnauthenticatedIdentities: " + isAllowUnauthenticatedIdentities() + ",");
        if (getSupportedLoginProviders() != null) sb.append("SupportedLoginProviders: " + getSupportedLoginProviders() + ",");
        if (getDeveloperProviderName() != null) sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getOpenIdConnectProviderARNs() != null) sb.append("OpenIdConnectProviderARNs: " + getOpenIdConnectProviderARNs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUnauthenticatedIdentities() == null) ? 0 : isAllowUnauthenticatedIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getSupportedLoginProviders() == null) ? 0 : getSupportedLoginProviders().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode()); 
        hashCode = prime * hashCode + ((getOpenIdConnectProviderARNs() == null) ? 0 : getOpenIdConnectProviderARNs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateIdentityPoolRequest == false) return false;
        CreateIdentityPoolRequest other = (CreateIdentityPoolRequest)obj;
        
        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null) return false;
        if (other.getIdentityPoolName() != null && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false) return false; 
        if (other.isAllowUnauthenticatedIdentities() == null ^ this.isAllowUnauthenticatedIdentities() == null) return false;
        if (other.isAllowUnauthenticatedIdentities() != null && other.isAllowUnauthenticatedIdentities().equals(this.isAllowUnauthenticatedIdentities()) == false) return false; 
        if (other.getSupportedLoginProviders() == null ^ this.getSupportedLoginProviders() == null) return false;
        if (other.getSupportedLoginProviders() != null && other.getSupportedLoginProviders().equals(this.getSupportedLoginProviders()) == false) return false; 
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null) return false;
        if (other.getDeveloperProviderName() != null && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false) return false; 
        if (other.getOpenIdConnectProviderARNs() == null ^ this.getOpenIdConnectProviderARNs() == null) return false;
        if (other.getOpenIdConnectProviderARNs() != null && other.getOpenIdConnectProviderARNs().equals(this.getOpenIdConnectProviderARNs()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateIdentityPoolRequest clone() {
        
            return (CreateIdentityPoolRequest) super.clone();
    }

}
    