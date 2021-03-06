/*
 * Copyright (c) 2015-2016 Vladimir Schneider <vladimir.schneider@gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class PluginDevelopersToolboxIcons {
    private static Icon load(String path) {
        return IconLoader.getIcon(path, PluginDevelopersToolboxIcons.class);
    }

    public static class EditorActions {
        //public static final Icon Strike_through = load("/icons/editor_actions/Strike_through.png"); // 16x16
    }

}
