/* 
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.dueros.data.request.permission.event;

import com.baidu.dueros.data.request.events.CommonEvent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * 用户拒绝授权事件
 * 
 * @author tianlonglong(tianlong02@baidu.com)
 * @version V1.0
 * @since 2018年06月29日
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("Permission.Rejected")
public class PermissionRejectedEvent extends CommonEvent {
    // 对应支付指令的token
    private String token;

    /**
     * 返回一个用来构造{@code PermissionRejectedEvent}的{@code Builder}
     * 
     * @return Builder 用来构造{@code PermissionRejectedEvent}
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * 通过{@code Builder}来构造{@code PermissionRejectedEvent}
     * 
     * @param builder
     *            用来构造{@code PermissionRejectedEvent}
     */
    protected PermissionRejectedEvent(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    /**
     * 用来实现JSON序列化、反序列化的构造方法
     * 
     * @param requestId
     *            requestId
     * @param timestamp
     *            timestamp
     * @param dialogRequestId
     *            dialogRequestId
     * @param token
     *            token
     */
    protected PermissionRejectedEvent(@JsonProperty("requestId") final String requestId,
            @JsonProperty("timestamp") final String timestamp,
            @JsonProperty("dialogRequestId") final String dialogRequestId, @JsonProperty("token") final String token) {
        super(requestId, timestamp, dialogRequestId);
        this.token = token;
    }

    /**
     * 获取token的getter方法
     * 
     * @return String token
     */
    public String getToken() {
        return token;
    }

    /**
     * 用来构造{@code PermissionRejectedEvent}
     * 
     * @author hujie08(hujie08@baidu.com)
     * @version V1.0
     * @since 2018年5月3日
     */
    public static final class Builder extends RequestBodyBuilder<Builder, PermissionRejectedEvent> {

        public String token;

        public Builder setToken(final String token) {
            this.token = token;
            return this;
        }

        @Override
        public PermissionRejectedEvent build() {
            return new PermissionRejectedEvent(this);
        }

    }
}
