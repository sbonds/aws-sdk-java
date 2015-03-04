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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The timeline of the cluster step lifecycle.
 * </p>
 */
public class StepTimeline implements Serializable, Cloneable {

    /**
     * The date and time when the cluster step was created.
     */
    private java.util.Date creationDateTime;

    /**
     * The date and time when the cluster step execution started.
     */
    private java.util.Date startDateTime;

    /**
     * The date and time when the cluster step execution completed or failed.
     */
    private java.util.Date endDateTime;

    /**
     * The date and time when the cluster step was created.
     *
     * @return The date and time when the cluster step was created.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The date and time when the cluster step was created.
     *
     * @param creationDateTime The date and time when the cluster step was created.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The date and time when the cluster step was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The date and time when the cluster step was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StepTimeline withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The date and time when the cluster step execution started.
     *
     * @return The date and time when the cluster step execution started.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The date and time when the cluster step execution started.
     *
     * @param startDateTime The date and time when the cluster step execution started.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The date and time when the cluster step execution started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The date and time when the cluster step execution started.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StepTimeline withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * The date and time when the cluster step execution completed or failed.
     *
     * @return The date and time when the cluster step execution completed or failed.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date and time when the cluster step execution completed or failed.
     *
     * @param endDateTime The date and time when the cluster step execution completed or failed.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date and time when the cluster step execution completed or failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date and time when the cluster step execution completed or failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StepTimeline withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
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
        if (getCreationDateTime() != null) sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null) sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getEndDateTime() != null) sb.append("EndDateTime: " + getEndDateTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StepTimeline == false) return false;
        StepTimeline other = (StepTimeline)obj;
        
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null) return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false) return false; 
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null) return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false) return false; 
        return true;
    }
    
    @Override
    public StepTimeline clone() {
        try {
            return (StepTimeline) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    