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

package org.example.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 1.0.0
 */
@Path("/AVIVA")
public class InsuranceService {

    private Map<String, Policy> policies;

    public InsuranceService()
    {
	policies = new HashMap<String, Policy>();
	Policy p1 = new Policy();
	policies.put(p1.getId(), p1);
    } 


    @GET
    @Path("/Policies/{policyid}")
    @Produces("application/json")
    public Policy get(@PathParam("policyid") String policyid) {
	return policies.get(policyid);
    }

   @GET
   @Path("/Policies/")
   @Produces("application/json")
   public Policy[] get() {
	return policies.values().toArray(new Policy[0]);
   }

    @POST
    @Path("/Policies")
    public Response post(Policy policy) {
        // TODO: Implementation for HTTP POST request
	Policy p = new Policy();
	p.setId(policy.getId());
	p.setAmount(policy.getAmount());
	p.setEndDate(policy.getEndDate());
	p.setPolicyHolder(policy.getPolicyHolder());
	policies.put(p.getId(), p);
        System.out.println("POST invoked for policy "+ policy.getPolicyHolder());
        return Response.status(Response.Status.OK).entity("Policy with ID " + p.getId() + " successfully added").build();
    }

    @PUT
    @Path("/")
    public void put() {
        // TODO: Implementation for HTTP PUT request
        System.out.println("PUT invoked");
    }

    @DELETE
    @Path("/Policies/{policyid}")
    public void delete() {
        // TODO: Implementation for HTTP DELETE request
        System.out.println("DELETE invoked");
    }
}
