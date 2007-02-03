/* 
 * ========================================================================
 * 
 * Copyright 2005 Vincent Massol.
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
 * 
 * ========================================================================
 */
package org.codehaus.cargo.module.ejb;

import org.codehaus.cargo.module.DescriptorTag;

/**
 * Represents the various tags in a ejb jar deployment descriptor.
 * 
 * @version $Id$
 */
public class EjbJarXmlTag extends DescriptorTag
{
    /**
     * Element name 'session'.
     */
    public static final EjbJarXmlTag SESSION = new EjbJarXmlTag("session");
    
    /**
     * Element name 'entity'.
     */
    public static final EjbJarXmlTag ENTITY = new EjbJarXmlTag("entity");
    
    /**
     * Element name 'ejb-name'.
     */
    public static final EjbJarXmlTag EJB_NAME = new EjbJarXmlTag("ejb-name");
    
    /**
     * Element name 'local'.
     */
    public static final EjbJarXmlTag LOCAL = new EjbJarXmlTag("local");
    
    /**
     * Element name 'local-home'.
     */
    public static final EjbJarXmlTag LOCAL_HOME = new EjbJarXmlTag("local-home");
    
    /**
     * Constructor.
     * 
     * @param tagName The tag name of the element
     * @param isMultipleAllowed Whether the element may occur multiple times in the descriptor
     */
    protected EjbJarXmlTag(String tagName, boolean isMultipleAllowed)
    {
        super(tagName, isMultipleAllowed);
    }
    
    /**
     * Constructor.
     * 
     * @param tagName The tag name of the element
     */
    protected EjbJarXmlTag(String tagName)
    {
        this(tagName, true);
    }
}
