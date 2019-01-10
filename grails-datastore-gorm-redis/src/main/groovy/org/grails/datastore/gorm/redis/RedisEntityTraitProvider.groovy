/*
 * Copyright 2015 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.grails.datastore.gorm.redis

import grails.redis.RedisEntity
import groovy.transform.CompileStatic
import org.grails.compiler.gorm.GormEntityTraitProvider
import org.grails.datastore.mapping.reflect.ClassUtils


/**
 * @author Graeme Rocher
 * @since 5.0
 */
@CompileStatic
class RedisEntityTraitProvider implements GormEntityTraitProvider {
    final Class entityTrait = RedisEntity
    final boolean available = ClassUtils.isPresent("redis.clients.jedis.Jedis")

    Class getEntityTrait() {
        return entityTrait
    }

    boolean isAvailable() {
        return available
    }
}
