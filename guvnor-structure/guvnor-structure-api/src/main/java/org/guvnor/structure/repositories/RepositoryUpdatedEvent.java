/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.guvnor.structure.repositories;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class RepositoryUpdatedEvent {

    private Repository repository;

    private Repository updatedRepository;

    public RepositoryUpdatedEvent() {
    }

    public RepositoryUpdatedEvent(final Repository repository, final Repository updatedRepository) {
        this.repository = repository;
        this.updatedRepository = updatedRepository;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository( final Repository repository ) {
        this.repository = repository;
    }

    public Repository getUpdatedRepository() {
        return updatedRepository;
    }

    public void setUpdatedRepository( final Repository updatedRepository ) {
        this.updatedRepository = updatedRepository;
    }
}
