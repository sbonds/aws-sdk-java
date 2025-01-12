/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPublishedVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardPublishedVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The version number of the dashboard.
     * </p>
     */
    private Long versionNumber;

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @return AWS account ID that contains the dashboard you are updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPublishedVersionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @return The ID for the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPublishedVersionRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The version number of the dashboard.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the dashboard.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the dashboard.
     * </p>
     * 
     * @return The version number of the dashboard.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the dashboard.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPublishedVersionRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardPublishedVersionRequest == false)
            return false;
        UpdateDashboardPublishedVersionRequest other = (UpdateDashboardPublishedVersionRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardPublishedVersionRequest clone() {
        return (UpdateDashboardPublishedVersionRequest) super.clone();
    }

}
