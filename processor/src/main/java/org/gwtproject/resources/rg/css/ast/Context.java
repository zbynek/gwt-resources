/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.resources.rg.css.ast;

/**
 * The context in which a CSSNode visitation occurs. This represents the set of possible operations
 * a CSSVisitor subclass can perform on the currently visited node.
 */
public interface Context {
  boolean canInsert();

  boolean canRemove();

  void insertAfter(CssNode node);

  void insertBefore(CssNode node);

  void removeMe();

  void replaceMe(CssNode node);
}
