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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A tag for a column in a TagColumnOperation. This is a variant type structure. No more than one of the attributes
 * should be non-null for this structure to be valid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     */
    private String columnGeographicRole;

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * 
     * @param columnGeographicRole
     *        A geospatial role for a column.
     * @see GeoSpatialDataRole
     */

    public void setColumnGeographicRole(String columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * 
     * @return A geospatial role for a column.
     * @see GeoSpatialDataRole
     */

    public String getColumnGeographicRole() {
        return this.columnGeographicRole;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * 
     * @param columnGeographicRole
     *        A geospatial role for a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoSpatialDataRole
     */

    public ColumnTag withColumnGeographicRole(String columnGeographicRole) {
        setColumnGeographicRole(columnGeographicRole);
        return this;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * 
     * @param columnGeographicRole
     *        A geospatial role for a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoSpatialDataRole
     */

    public ColumnTag withColumnGeographicRole(GeoSpatialDataRole columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole.toString();
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
        if (getColumnGeographicRole() != null)
            sb.append("ColumnGeographicRole: ").append(getColumnGeographicRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnTag == false)
            return false;
        ColumnTag other = (ColumnTag) obj;
        if (other.getColumnGeographicRole() == null ^ this.getColumnGeographicRole() == null)
            return false;
        if (other.getColumnGeographicRole() != null && other.getColumnGeographicRole().equals(this.getColumnGeographicRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnGeographicRole() == null) ? 0 : getColumnGeographicRole().hashCode());
        return hashCode;
    }

    @Override
    public ColumnTag clone() {
        try {
            return (ColumnTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
