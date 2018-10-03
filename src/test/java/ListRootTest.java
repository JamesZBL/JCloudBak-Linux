/*
 * Copyright 2018 JamesZBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

import org.junit.Test;

import java.io.File;
import java.io.PrintStream;
import java.util.stream.Stream;

/**
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-10-03
 */
public class ListRootTest {

    private static final PrintStream o = System.out;

    @Test
    public void testListRoots() {
        String user = System.getProperty("user.name");
        StringBuilder sb = new StringBuilder();
        String root = sb.append("/media").append("/").append(user).toString();
        File fileRoot = new File(root);
        File[] files = fileRoot.listFiles();
        if (files != null) {
            Stream.of(files).forEach(o::println);
        }
    }
}
