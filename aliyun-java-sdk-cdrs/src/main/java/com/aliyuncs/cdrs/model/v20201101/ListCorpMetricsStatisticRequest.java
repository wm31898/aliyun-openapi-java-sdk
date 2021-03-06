/*
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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCorpMetricsStatisticRequest extends RpcAcsRequest<ListCorpMetricsStatisticResponse> {
	   

	private String corpId;

	private String endTime;

	private String startTime;

	private Long pageNumber;

	private String deviceGroupList;

	private String tagCode;

	private String userGroupList;

	private Long pageSize;

	private String deviceIdList;
	public ListCorpMetricsStatisticRequest() {
		super("CDRS", "2020-11-01", "ListCorpMetricsStatistic");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDeviceGroupList() {
		return this.deviceGroupList;
	}

	public void setDeviceGroupList(String deviceGroupList) {
		this.deviceGroupList = deviceGroupList;
		if(deviceGroupList != null){
			putBodyParameter("DeviceGroupList", deviceGroupList);
		}
	}

	public String getTagCode() {
		return this.tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
		if(tagCode != null){
			putBodyParameter("TagCode", tagCode);
		}
	}

	public String getUserGroupList() {
		return this.userGroupList;
	}

	public void setUserGroupList(String userGroupList) {
		this.userGroupList = userGroupList;
		if(userGroupList != null){
			putBodyParameter("UserGroupList", userGroupList);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getDeviceIdList() {
		return this.deviceIdList;
	}

	public void setDeviceIdList(String deviceIdList) {
		this.deviceIdList = deviceIdList;
		if(deviceIdList != null){
			putBodyParameter("DeviceIdList", deviceIdList);
		}
	}

	@Override
	public Class<ListCorpMetricsStatisticResponse> getResponseClass() {
		return ListCorpMetricsStatisticResponse.class;
	}

}
