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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAppResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAppResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchAppResponseUnmarshaller {

	public static QueryPictureSearchAppResponse unmarshall(QueryPictureSearchAppResponse queryPictureSearchAppResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchAppResponse.setRequestId(_ctx.stringValue("QueryPictureSearchAppResponse.RequestId"));
		queryPictureSearchAppResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchAppResponse.Success"));
		queryPictureSearchAppResponse.setCode(_ctx.stringValue("QueryPictureSearchAppResponse.Code"));
		queryPictureSearchAppResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchAppResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchAppResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTenantId(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].TenantId"));
			dataItem.setAppInstanceId(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].AppInstanceId"));
			dataItem.setAppTemplateId(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].AppTemplateId"));
			dataItem.setVersion(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].Version"));
			dataItem.setLevel(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].Level"));
			dataItem.setName(_ctx.stringValue("QueryPictureSearchAppResponse.Data["+ i +"].Name"));
			dataItem.setCreateTime(_ctx.longValue("QueryPictureSearchAppResponse.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.longValue("QueryPictureSearchAppResponse.Data["+ i +"].ModifiedTime"));

			data.add(dataItem);
		}
		queryPictureSearchAppResponse.setData(data);
	 
	 	return queryPictureSearchAppResponse;
	}
}