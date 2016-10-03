/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.jet2.impl;

import java.util.Collection;

/**
 * The head-end of a bounded non-blocking queue.
 * @param <T> Type if items in the queue.
 */
public interface QueueHead<T> {

    /**
     * Drains all available items to the supplied destination collection.
     * @return <code>true</code> if the data source connectod to this queue is exhausted;
     * <code>false</code> otherwise.
     */
    TaskletResult drainTo(Collection<? super T> dest);

    int getOrdinal();

    int getPriority();
}
