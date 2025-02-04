/*
 *
 * Copyright © ${year} ${name}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.resources.client;

import static jsinterop.annotations.JsPackage.GLOBAL;

import elemental2.core.JsObject;
import jsinterop.annotations.JsType;

/** @author Dmitrii Tikhomirov Created by treblereel on 10/16/18. */
@JsType(isNative = true, namespace = GLOBAL)
public class JSON {

  public static native String stringify(JsObject obj);

  public static native JsObject parse(String obj);
}
