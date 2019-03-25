/*
 * Copyright 2019 the original author or authors.
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

package org.gradle.nativeplatform.fixtures.app

import org.gradle.integtests.fixtures.SourceFile

class Swift5 extends SwiftSourceElement {
    Swift5(String projectName) {
        super(projectName)
    }

    @Override
    List<SourceFile> getFiles() {
        return [sourceFile("swift", "swift5-code.swift", '''
            public func getRawString() -> String {
                let value = 42
                return #"Raw string are ones with "quotes", backslash (\\), but can do special string interpolation (\\#(value))"#
            }
        ''')]
    }
}
