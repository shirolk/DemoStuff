/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This is the Policy class.
 */

package org.example.service;

public class Policy implements java.io.Serializable {  
	
	private String id;
	private int amount;
	private String endDate;
	private String policyHolder;  
	  
	public Policy()
	{
		this.id = "0001";
		this.amount = 1400;
		this.endDate = "19-JUL-2017";
		this.policyHolder = "John Doe"; 
	}  
	  
	public void setId(String id)
	{
		this.id=id;
        }  
	  
	public String getId()
        {
                return id;
        }
  
	public void setAmount(int amount)
	{
		this.amount=amount;
        }  
	  
	public int getAmount()
        {
                return amount;
        }  
  
	public void setEndDate(String endDate)
	{
		this.endDate=endDate;
        }  
	  
	public String getEndDate()
        {
                return endDate;
        }  
  
	public void setPolicyHolder(String policyHolder)
	{
		this.policyHolder=policyHolder;
        }  
	  
	public String getPolicyHolder()
        {
                return policyHolder;
        }  
  
}  
