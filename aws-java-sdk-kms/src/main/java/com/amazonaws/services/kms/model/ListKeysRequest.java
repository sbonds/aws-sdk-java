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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#listKeys(ListKeysRequest) ListKeys operation}.
 * <p>
 * Lists the customer master keys.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#listKeys(ListKeysRequest)
 */
public class ListKeysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specify this parameter only when paginating results to indicate the
     * maximum number of keys you want listed in the response. If there are
     * additional keys beyond the maximum you specify, the
     * <code>Truncated</code> response element will be set to
     * <code>true.</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>NextMarker</code> in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * Specify this parameter only when paginating results to indicate the
     * maximum number of keys you want listed in the response. If there are
     * additional keys beyond the maximum you specify, the
     * <code>Truncated</code> response element will be set to
     * <code>true.</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Specify this parameter only when paginating results to indicate the
     *         maximum number of keys you want listed in the response. If there are
     *         additional keys beyond the maximum you specify, the
     *         <code>Truncated</code> response element will be set to
     *         <code>true.</code>
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Specify this parameter only when paginating results to indicate the
     * maximum number of keys you want listed in the response. If there are
     * additional keys beyond the maximum you specify, the
     * <code>Truncated</code> response element will be set to
     * <code>true.</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit Specify this parameter only when paginating results to indicate the
     *         maximum number of keys you want listed in the response. If there are
     *         additional keys beyond the maximum you specify, the
     *         <code>Truncated</code> response element will be set to
     *         <code>true.</code>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Specify this parameter only when paginating results to indicate the
     * maximum number of keys you want listed in the response. If there are
     * additional keys beyond the maximum you specify, the
     * <code>Truncated</code> response element will be set to
     * <code>true.</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit Specify this parameter only when paginating results to indicate the
     *         maximum number of keys you want listed in the response. If there are
     *         additional keys beyond the maximum you specify, the
     *         <code>Truncated</code> response element will be set to
     *         <code>true.</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListKeysRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>NextMarker</code> in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>NextMarker</code> in
     *         the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>NextMarker</code> in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>NextMarker</code> in
     *         the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>NextMarker</code> in
     * the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>NextMarker</code> in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListKeysRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListKeysRequest == false) return false;
        ListKeysRequest other = (ListKeysRequest)obj;
        
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListKeysRequest clone() {
        
            return (ListKeysRequest) super.clone();
    }

}
    