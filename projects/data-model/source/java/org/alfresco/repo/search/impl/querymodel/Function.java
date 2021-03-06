/*
 * Copyright (C) 2005-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.repo.search.impl.querymodel;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.alfresco.service.namespace.QName;

/**
 * @author andyh
 */
public interface Function
{   
    /**
     * Evaluation a function
     * 
     * @param args
     * @return
     */
    public Serializable getValue(Map<String, Argument> args, FunctionEvaluationContext context);

    /**
     * Get the return type for the function
     * 
     * @return
     */
    public QName getReturnType();

    /**
     * Get the function name
     * 
     * @return
     */
    public String getName();
    
    /**
     * Get the argument Definitions
     * @return
     */
    public LinkedHashMap<String, ArgumentDefinition> getArgumentDefinitions();
    
    
    /**
     * Get the argument Definition
     * @return
     */
    public ArgumentDefinition getArgumentDefinition(String name);
    

}
