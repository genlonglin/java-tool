/* 
 * Copyright (C) 2013 The Java Tool project
 * Gelin Luo <greenlaw110(at)gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.greenlaw110.exception;

import com.greenlaw110.util.S;

/**
 * Could be used when programmer think it is not logic to reach somewhere. 
 * For example, the default branch of a switch case on an enum value
 */
public class UnexpectedException extends RuntimeException {

    public UnexpectedException(){
        super();
    }

    public UnexpectedException(String message){
        super(message);
    }

    public UnexpectedException(String message, Object... args){
        super(S.fmt(message, args));
    }

    public UnexpectedException(Throwable cause){
        super(cause);
    }

    /**
     * Construct a FastRuntimeException with cause, message and message arguments
     * @param cause
     * @param message
     * @param args
     */
    public UnexpectedException(Throwable cause, String message, Object... args) {
        super(S.fmt(message, args), cause);
    }
}
