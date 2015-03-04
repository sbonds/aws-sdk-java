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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#invokeAsync(InvokeAsyncRequest) InvokeAsync operation}.
 * <p>
 * Submits an invocation request to AWS Lambda. Upon receiving the
 * request, Lambda executes the specified function asynchronously. To see
 * the logs generated by the Lambda function execution, see the
 * CloudWatch logs console.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:InvokeAsync</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#invokeAsync(InvokeAsyncRequest)
 */
public class InvokeAsyncRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     */
    private String functionName;

    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     */
    private java.io.InputStream invokeArgs;

    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @return The Lambda function name.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param functionName The Lambda function name.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_]+<br/>
     *
     * @param functionName The Lambda function name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeAsyncRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     *
     * @return JSON that you want to provide to your Lambda function as input.
     */
    public java.io.InputStream getInvokeArgs() {
        return invokeArgs;
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * You can either specify a raw InputStream as the content - this stream must implement
     * mark/reset in order for signature calculation to be performed before this data is read
     * for the request payload. Or, you can specify a String which will be converted into a
     * UTF8-encoded byte stream.
     *
     * @param invokeArgs JSON that you want to provide to your Lambda function as input.
     */
    public void setInvokeArgs(java.io.InputStream invokeArgs) {
        this.invokeArgs = invokeArgs;
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * You can either specify a raw InputStream as the content - this stream must implement
     * mark/reset in order for signature calculation to be performed before this data is read
     * for the request payload. Or, you can specify a String which will be converted into a
     * UTF8-encoded byte stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invokeArgs JSON that you want to provide to your Lambda function as input.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeAsyncRequest withInvokeArgs(java.io.InputStream invokeArgs) {
        this.invokeArgs = invokeArgs;
        return this;
    }

    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * You can either specify a raw InputStream as the content - this stream must implement
     * mark/reset in order for signature calculation to be performed before this data is read
     * for the request payload. Or, you can specify a String which will be converted into a
     * UTF8-encoded byte stream.
     *
     * @param invokeArgs JSON that you want to provide to your Lambda function as input.
     */
    public void setInvokeArgs(String invokeArgs) {
        try {
            this.invokeArgs = new com.amazonaws.util.StringInputStream(invokeArgs);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new com.amazonaws.AmazonClientException(e);
        }
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * You can either specify a raw InputStream as the content - this stream must implement
     * mark/reset in order for signature calculation to be performed before this data is read
     * for the request payload. Or, you can specify a String which will be converted into a
     * UTF8-encoded byte stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invokeArgs JSON that you want to provide to your Lambda function as input.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeAsyncRequest withInvokeArgs(String invokeArgs) {
        setInvokeArgs(invokeArgs);
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
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvokeArgs() != null) sb.append("InvokeArgs: " + getInvokeArgs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getInvokeArgs() == null) ? 0 : getInvokeArgs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InvokeAsyncRequest == false) return false;
        InvokeAsyncRequest other = (InvokeAsyncRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getInvokeArgs() == null ^ this.getInvokeArgs() == null) return false;
        if (other.getInvokeArgs() != null && other.getInvokeArgs().equals(this.getInvokeArgs()) == false) return false; 
        return true;
    }
    
    @Override
    public InvokeAsyncRequest clone() {
        
            return (InvokeAsyncRequest) super.clone();
    }

}
    