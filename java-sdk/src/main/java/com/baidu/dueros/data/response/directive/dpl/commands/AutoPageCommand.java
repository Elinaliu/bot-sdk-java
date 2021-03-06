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

package com.baidu.dueros.data.response.directive.dpl.commands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 实现pager组件的的自动翻页功能, 执行一次最终停留在最后的页面
 * 
 * @author hujie08(hujie08@baidu.com)
 * @version V1.0
 * @since 2018年4月28日
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoPageCommand extends BaseCommand {

    private long durationInMillisecond;

    public long getDurationInMillisecond() {
        return durationInMillisecond;
    }

    public AutoPageCommand setDurationInMillisecond(long durationInMillisecond) {
        this.durationInMillisecond = durationInMillisecond;
        return this;
    }

    public AutoPageCommand() {
        super("AutoPage");
    }

}
